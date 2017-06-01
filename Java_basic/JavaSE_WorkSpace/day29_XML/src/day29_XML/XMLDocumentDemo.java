package day29_XML;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class XMLDocumentDemo {
	
	public static Document getDocument(File f) throws Exception{
		//�������� DocumentBuiderFactory
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		//�õ�dom������ DocumentBuilder
		DocumentBuilder db =dbf.newDocumentBuilder();
		
		//����xml�ĵ����õ������ĵ���document
		Document doc = db.parse(f);
		return doc;
	}

}
