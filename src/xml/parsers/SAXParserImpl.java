package xml.parsers;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import xml.parsers.Employee;

public class SAXParserImpl {

	public List<Employee> parse(String filePath) throws Exception {
		SAXParserFactory parserFactor = SAXParserFactory.newInstance();
		SAXParser parser = parserFactor.newSAXParser();
		SAXHandler handler = new SAXHandler();
		parser.parse(new FileInputStream(filePath), handler);
		return handler.getEmpList();
	}
}

/**
 * The Handler for SAX Events.
 */
class SAXHandler extends DefaultHandler {

	private List<Employee> empList = new ArrayList<>();
	private Employee emp = null;
	private String content = null;

	@Override
	// Triggered when the start of tag is found.
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {

		switch (qName) {
		// Create a new Employee object when the start tag is found
		case "employee":
			emp = new Employee();
			emp.id = attributes.getValue("id");
			break;
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		switch (qName) {
		// Add the employee to list once end tag is found
		case "ClinicalDocument":
			empList.add(emp);
			break;
		// For all other end tags the employee has to be updated.
		case "firstName":
			emp.firstName = content;
			break;
		case "lastName":
			emp.lastName = content;
			break;
		case "location":
			emp.location = content;
			break;
		}
	}

	@Override
	public void characters(char[] ch, int start, int length)throws SAXException {
		content = String.copyValueOf(ch, start, length).trim();
	}

	public List<Employee> getEmpList() {
		return empList;
	}

}
