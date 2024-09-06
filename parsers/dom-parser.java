import String;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.ByteArrayInputStream;

public class DOMParserExample {
    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(new ByteArrayInputStream(xmlString.getBytes()));

        NodeList bookList = doc.getElementsByTagName("book");
        for (int i = 0; i < bookList.getLength(); i++) {
            Element book = (Element) bookList.item(i);
            String title = book.getElementsByTagName("title").item(0).getTextContent();
            String author = book.getElementsByTagName("author").item(0).getTextContent();
            System.out.println("Title: " + title + ", Author: " + author);
        }
    }
}
