package day29_XML;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class XMLDocumentDemo {
	
	public static Document getDocument(File f) throws Exception{
		//创建工厂 DocumentBuiderFactory
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		//得到dom解析器 DocumentBuilder
		DocumentBuilder db =dbf.newDocumentBuilder();
		
		//解析xml文档，得到代表文档的document
		Document doc = db.parse(f);
		return doc;
	}

}
