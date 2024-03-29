package xml.parsers;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class StaxParserImpl {
	public List<Employee> parse(String filePath) throws XMLStreamException {
		List<Employee> empList = null;
		Employee currEmp = null;
		String tagContent = null;
		XMLInputFactory factory = XMLInputFactory.newInstance();
		try {
			FileInputStream fis = new FileInputStream(filePath);
			System.out.println("file size "+fis.available());
			XMLStreamReader reader = factory.createXMLStreamReader(fis);
			while (reader.hasNext()) {
				int event = reader.next();
				switch (event) {
				case XMLStreamConstants.START_ELEMENT:
					if ("employee".equals(reader.getLocalName())) {
						currEmp = new Employee();
						currEmp.id = reader.getAttributeValue(0);
					}
					if ("employees".equals(reader.getLocalName())) {
						empList = new ArrayList<>();
					}
					break;

				case XMLStreamConstants.CHARACTERS:
					tagContent = reader.getText().trim();
					break;

				case XMLStreamConstants.END_ELEMENT:
					switch (reader.getLocalName()) {
					case "employee":
						empList.add(currEmp);
						break;
					case "firstName":
						currEmp.firstName = tagContent;
						break;
					case "lastName":
						currEmp.lastName = tagContent;
						break;
					case "location":
						currEmp.location = tagContent;
						break;
					}
					break;

				case XMLStreamConstants.START_DOCUMENT:
					empList = new ArrayList<>();
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return empList;
	}
}
