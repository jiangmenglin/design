package com.jml.design.util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.InputStream;

/**
 * @Author: jml
 * @Date: 18-3-23
 * @Description:
 */
public class XMLUtil {
    //从XML配置文件中提取具体的类名，并返回一个实例对象
    public static Object getBean(String name) {
        try {
            //创建文档
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            InputStream file = Thread.currentThread().getContextClassLoader().getResourceAsStream("resource" + File.separator + name);
            Document doc = builder.parse(file);

            //获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            String className = classNode.getNodeValue();

            //通过反射拿到对象并返回
            Class clazz = Class.forName(className);
            return clazz.newInstance();
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.printf("the bean is :%s", getBean("config.xml").getClass().getName());
    }
}
