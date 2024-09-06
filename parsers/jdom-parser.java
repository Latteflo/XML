import String;
import org.jdom2.*;
import org.jdom2.input.*;
import java.io.StringReader;
import java.util.List;

public class JDOMParserExample {
    public static void main(String[] args) throws Exception {
        SAXBuilder saxBuilder = new SAXBuilder();
        Document doc = saxBuilder.build(new StringReader(xmlString));

        Element rootElement = doc.getRootElement();
        List<Element> bookList = rootElement.getChildren("book");

        for (Element book : bookList) {
            String title = book.getChildText("title");
            String author = book.getChildText("author");
            System.out.println("Title: " + title + ", Author: " + author);
        }
    }
}
