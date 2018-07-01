package com.jml.design.xml;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStreamWriter;

/**
 * @Author: jml
 * @Date: 18-3-24
 * @Description:
 */
public class BooksXmlParser {
    private static DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    private static Element theBook = null, theElement = null, root = null;

    public static void  add(Book book) {
        try {
            factory.setIgnoringElementContentWhitespace(true);
            DocumentBuilder  builder = factory.newDocumentBuilder();
            InputStream xmlResource = Thread.currentThread().getClass().getClassLoader().getResourceAsStream("xml" + File.separator + "books.xml");
            //获取当前的路径
//            String path = Thread.currentThread().getClass().getClassLoader().getResource("/").getPath();
            //xml文件的路径
            Document doc = builder.parse(xmlResource);
            root = doc.getDocumentElement();  //获取XML根节点

            //新建一本书的节点
            theBook = doc.createElement("book");
            theElement = doc.createElement("name");
            theElement.setTextContent(book.getName());
            theBook.appendChild(theElement);
            theElement = doc.createElement("price");
            theElement.setTextContent(book.getPrice().toString());
            theBook.appendChild(theElement);
            theElement = doc.createElement("memo");
            theElement.setTextContent(book.getMemo());
            theBook.setAttribute("id", book.getId());
            theBook.appendChild(theElement);
            root.appendChild(theBook);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
