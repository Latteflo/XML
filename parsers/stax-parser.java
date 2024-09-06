import String;
import javax.xml.stream.*;
import java.io.StringReader;

public class StAXParserExample {
    public static void main(String[] args) throws Exception {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader reader = factory.createXMLStreamReader(new StringReader(xmlString));

        String title = "";
        while (reader.hasNext()) {
            int event = reader.next();
            if (event == XMLStreamConstants.START_ELEMENT) {
                if ("title".equals(reader.getLocalName())) {
                    title = reader.getElementText();
                    System.out.println("Title: " + title);
                }
            }
        }
    }
}
