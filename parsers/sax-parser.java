import String;
import org.xml.sax.*;
import org.xml.sax.helpers.*;
import javax.xml.parsers.*;
import java.io.ByteArrayInputStream;

public class SAXParserExample extends DefaultHandler {
    private String currentElement = "";
    private boolean isTitle = false;

    public static void main(String[] args) throws Exception {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        SAXParserExample handler = new SAXParserExample();
        saxParser.parse(new ByteArrayInputStream(xmlString.getBytes()), handler);
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        currentElement = qName;
        if ("title".equals(currentElement)) {
            isTitle = true;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        if (isTitle) {
            System.out.println("Title: " + new String(ch, start, length));
            isTitle = false;
        }
    }
}