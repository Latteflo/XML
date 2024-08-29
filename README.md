# XML

This is an XML repository - a collection of notes taken in my learning journey of XML.


## Table of Contents

- [XML](#xml)
  - [Table of Contents](#table-of-contents)
  - [What is XML?](#what-is-xml)
  - [Why XML?](#why-xml)
  - [XML Syntax](#xml-syntax)
  - [XML Elements](#xml-elements)
  - [XML Attributes](#xml-attributes)
  - [XML Comments](#xml-comments)
  - [XML Processing Instructions](#xml-processing-instructions)
  - [XML Namespaces](#xml-namespaces)
  - [XML Schema](#xml-schema)
  - [XML DTD](#xml-dtd)
  - [XML Parsing](#xml-parsing)
  - [Conclusion](#conclusion)
  - [References](#references)


Projects :

- [XML Parsing](#xml-parsing) 
- [XML Schema](#xml-schema)
- [XML DTD](#xml-dtd)


## What is XML?
 
XML stands for eXtensible Markup Language. It is a markup language that defines a set of rules for encoding documents in a format that is both human-readable and machine-readable. It is a software- and hardware-independent tool for storing and transporting data.

## Why XML?

XML is a popular format for sharing data on the web. It is used in a wide variety of applications, from web services to data storage. XML is a simple and flexible format that is easy to read and write. It is also extensible, meaning that you can define your own tags and attributes.

## XML Syntax

XML documents are made up of elements, attributes, and text. An element is a structure that can contain other elements, attributes, or text. An attribute is a name-value pair that is associated with an element. Text is the content of an element.

Here is an example of an XML document:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<note>
  <to>Tove</to>
  <from>Jani</from>
  <heading>Reminder</heading>
  <body>Don't forget me this weekend!</body>
</note>
```

In this example, the root element is `<note>`, which contains four child elements: `<to>`, `<from>`, `<heading>`, and `<body>`. Each child element contains text.

## XML Elements

XML elements are the building blocks of an XML document. An element is a structure that can contain other elements, attributes, or text. Elements are enclosed in angle brackets (`<` and `>`). An element has a start tag, content, and an end tag. The start tag is the name of the element enclosed in angle brackets. The end tag is the name of the element preceded by a forward slash (`/`) and enclosed in angle brackets.  The content of an element is the text, other elements, and attributes that are enclosed between the start and end tags.

Here is an example of an XML element:

```xml
<note>
  <to>Tove</to>
</note>
```

In this example, the element `<to>` has a start tag `<to>`, content `Tove`, and an end tag `</to>`.

## XML Attributes

XML attributes are name-value pairs that are associated with an element. Attributes are used to provide additional information about an element. An attribute is specified in the start tag of an element. The attribute name is followed by an equal sign (`=`) and the attribute value enclosed in double quotes (`"`).

Here is an example of an XML attribute:

```xml
<note date="2022-01-01">
  <to>Tove</to>
</note>
```


In this example, the element `<note>` has an attribute `date` with the value `2022-01-01`.

## XML Comments

XML comments are used to add comments to an XML document. Comments are ignored by the XML parser and are not displayed in the output. Comments are enclosed in `<!--` and `-->`.

Here is an example of an XML comment:

```xml
<!-- This is a comment -->
<note>
  <to>Tove</to>

</note>
```

In this example, the comment `This is a comment` is added before the element `<note>`.

## XML Processing Instructions

XML processing instructions are used to add processing information to an XML document. Processing instructions are enclosed in `<?` and `?>`. Processing instructions are used to specify how an XML document should be processed.

Here is an example of an XML processing instruction:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<note>
  <to>Tove</to>
</note>
```

In this example, the processing instruction `<?xml version="1.0" encoding="UTF-8"?>` specifies the version of XML and the character encoding used in the document.

## XML Namespaces

XML namespaces are used to avoid naming conflicts in XML documents. Namespaces are defined using the `xmlns` attribute in the start tag of an element. The `xmlns` attribute specifies the namespace URI, which is a unique identifier for the namespace.

Here is an example of an XML namespace:

```xml
<note xmlns="http://www.example.com/note">
  <to>Tove</to>
</note>
```

In this example, the element `<note>` is in the namespace `http://www.example.com/note`.

## XML Schema

XML Schema is a language for defining the structure of an XML document. XML Schema is used to validate the structure of an XML document against a set of rules. XML Schema defines the elements, attributes, and data types that are allowed in an XML document.

Here is an example of an XML Schema:

```xml
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema">
  <xs:element name="note">
    <xs:complexType>
      <xs:sequence>
        <xs:element name="to" type="xs:string"/>
        <xs:element name="from" type="xs:string"/>
        <xs:element name="heading" type="xs:string"/>
        <xs:element name="body" type="xs:string"/>
      </xs:sequence>
    </xs:complexType>
  </xs:element>
</xs:schema>

```

In this example, the XML Schema defines the structure of a `<note>` element with four child elements: `<to>`, `<from>`, `<heading>`, and `<body>`. Each child element is of type `xs:string`.

## XML DTD

XML DTD (Document Type Definition) is a language for defining the structure of an XML document. XML DTD is used to validate the structure of an XML document against a set of rules. XML DTD defines the elements, attributes, and data types that are allowed in an XML document.

Here is an example of an XML DTD:

```xml
<!DOCTYPE note [
  <!ELEMENT note (to, from, heading, body)>
  <!ELEMENT to (#PCDATA)>
  <!ELEMENT from (#PCDATA)>
  <!ELEMENT heading (#PCDATA)>
  <!ELEMENT body (#PCDATA)>
]>
<note>
  <to>Tove</to>
  <from>Jani</from>
  <heading>Reminder</heading>
  <body>Don't forget me this weekend!</body>
</note>
```

In this example, the XML DTD defines the structure of a `<note>` element with four child elements: `<to>`, `<from>`, `<heading>`, and `<body>`. Each child element contains character data (`#PCDATA`).

## XML Parsing

XML parsing is the process of reading an XML document and extracting information from it. XML parsing is done by an XML parser, which reads the XML document and converts it into a format that can be used by an application. There are different types of XML parsers, such as DOM parsers, SAX parsers, and StAX parsers.

Here is an example of XML parsing using a DOM parser in Java:

```java
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;


public class XMLParser {
  public static void main(String[] args) {
    try {
      File file = new File("note.xml");
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      DocumentBuilder db = dbf.newDocumentBuilder();
      Document doc = db.parse(file);
      doc.getDocumentElement().normalize();
      NodeList nodeList = doc.getElementsByTagName("note");
      for (int i = 0; i < nodeList.getLength(); i++) {
        Node node = nodeList.item(i);
        if (node.getNodeType() == Node.ELEMENT_NODE) {
          Element element = (Element) node;
          System.out.println("To: " + element.getElementsByTagName("to").item(0).getTextContent());
          System.out.println("From: " + element.getElementsByTagName("from").item(0).getTextContent());
          System.out.println("Heading: " + element.getElementsByTagName("heading").item(0).getTextContent());
          System.out.println("Body: " + element.getElementsByTagName("body").item(0).getTextContent());
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
``` 

In this example, an XML document `note.xml` is read using a DOM parser in Java. The parser reads the document and extracts information from it.

## Conclusion

XML is a powerful and flexible format for sharing data on the web. It is widely used in a variety of applications, from web services to data storage. XML documents are made up of elements, attributes, and text. Elements are the building blocks of an XML document, attributes provide additional information about an element, and text is the content of an element. XML processing instructions are used to add processing information to an XML document, and XML namespaces are used to avoid naming conflicts in XML documents. XML Schema and XML DTD are used to define the structure of an XML document and validate it against a set of rules. XML parsing is the process of reading an XML document and extracting information from it using an XML parser.

## References

- [W3Schools XML Tutorial](https://www.w3schools.com/xml/)
- [XML.com](https://www.xml.com/)
- [XML Schema Tutorial](https://www.w3schools.com/xml/schema_intro.asp)
- [XML DTD Tutorial](https://www.w3schools.com/xml/xml_dtd_intro.asp)
- [Java XML Parsing Tutorial](https://www.tutorialspoint.com/java_xml/java_dom_parse_document.htm)
- [XML Namespaces Tutorial](https://www.w3schools.com/xml/xml_namespaces.asp)
- [XML Processing Instructions Tutorial](https://www.w3schools.com/xml/xml_processing.asp)
- [XML Comments Tutorial](https://www.w3schools.com/xml/xml_comments.asp)
- [XML Attributes Tutorial](https://www.w3schools.com/xml/xml_attributes.asp)
- [XML Elements Tutorial](https://www.w3schools.com/xml/xml_elements.asp)
- [XML Syntax Tutorial](https://www.w3schools.com/xml/xml_syntax.asp)
- [XML Tutorial](https://www.tutorialspoint.com/xml/index.htm)
