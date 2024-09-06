import String;
import javax.xml.parsers.*;
import javax.xml.xpath.*;
import org.w3c.dom.*;
import java.io.ByteArrayInputStream;

public class XPathExample {
    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(new ByteArrayInputStream(xmlString.getBytes()));

        XPathFactory xPathfactory = XPathFactory.newInstance();
        XPath xpath = xPathfactory.newXPath();

        String xpathExpression = "//book[author='J.K. Rowling']/title/text()";
        String title = xpath.evaluate(xpathExpression, doc);
        System.out.println("J.K. Rowling's book title: " + title);
    }
}