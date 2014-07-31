package xml.parsers;

public class CompareParsers {
	public static void main(String[] args) throws Exception {
			final String FILE_PATH="xml/SampleCDADocument.xml";
			long start = System.currentTimeMillis();
			StaxParserImpl demo = new StaxParserImpl();
			demo.parse(FILE_PATH);		
			System.out.println("Stax(time in milliseconds) "+String.valueOf(System.currentTimeMillis() - start));
			start = System.currentTimeMillis();
			DOMParserImpl domParser= new DOMParserImpl();
			domParser.parse(FILE_PATH);		
			System.out.println("Dom(time in milliseconds) "+String.valueOf(System.currentTimeMillis() - start));
			start = System.currentTimeMillis();
			SAXParserImpl saxParser = new SAXParserImpl();
			saxParser.parse(FILE_PATH);		
			System.out.println("Sax(time in milliseconds) "+String.valueOf(System.currentTimeMillis() - start));
			
	}
}
