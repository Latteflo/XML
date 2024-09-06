import String;
import org.dom4j.*;
import org.dom4j.io.*;
import java.io.StringReader;

public class DOM4JParserExample {
    public static void main(String[] args) throws Exception {
        SAXReader reader = new SAXReader();
        Document document = reader.read(new StringReader(xmlString));

        List<Node> books = document.selectNodes("//book");
        for (Node node : books) {
            String title = node.selectSingleNode("title").getText();
            String author = node.selectSingleNode("author").getText();
            System.out.println("Title: " + title + ", Author: " + author);
        }
    }
}