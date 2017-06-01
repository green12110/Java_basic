package day29_XML;

import java.io.File;
import java.io.FileOutputStream;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

//对xml文档进行crud操作
public class DocumentTest {

	// 进行读操作
	@Test
	public void testRead() throws Exception {
		File f = new File("src/book.xml");
		Document doc = XMLDocumentDemo.getDocument(f);

		// NodeList getElementsByTagName(String tagname)
		// 按文档顺序返回包含在文档中且具有给定标记名称的所有 Element 的 NodeList
		NodeList nodelist = doc.getElementsByTagName("书");
		int length = nodelist.getLength();
		Node n1 = nodelist.item(0);
		String name = n1.getNodeName();
		String cont = n1.getTextContent();
		// Node n2 = nodelist.item(1);
		System.out.println(length);
		System.out.println(name + "==" + cont);
	}

	// 读取xml所有标签
	@Test
	public void testReadAll() throws Exception {
		File f = new File("src/book.xml");
		Document doc = XMLDocumentDemo.getDocument(f);
		// 得到根节点
		Node root = doc.getElementsByTagName("书架").item(0);
		list(root);

	}

	public void list(Node node) {
		if (node instanceof Element) {
			System.out.println(node.getNodeName());
		}
		NodeList nodelist = node.getChildNodes();
		for (int i = 0; i < nodelist.getLength(); i++) {
			// System.out.println(nodelist.item(i).getNodeName());
			Node n = nodelist.item(i);
			list(n);

		}
	}

	// 得到xml标签的属性的值 <书名 name="xxxx">平凡的世界</书名>
	@Test
	public void testGetAtt() throws Exception {
		File f = new File("src/book.xml");
		Document doc = XMLDocumentDemo.getDocument(f);
		// 得到标签
		Element root = (Element) doc.getElementsByTagName("书名").item(0);
		String value = root.getAttribute("name");
		System.out.println(value);
	}

	// 向xml文档中添加节点 <售价>59.00元<售价/>
	@Test
	public void testAdd() throws Exception {
		File f = new File("src/book.xml");
		Document doc = XMLDocumentDemo.getDocument(f);
		//创建节点
		Element element = doc.createElement("售价");
		element.setTextContent("59.00元");
		// 得到标签
		Element root = (Element)doc.getElementsByTagName("书").item(0);
		//默认在最后面添加一个孩子
		root.appendChild(element);
		//创建工厂
		TransformerFactory tffactory = TransformerFactory.newInstance();
		//得到Transfomer实例
		Transformer tf = tffactory.newTransformer();
		//转换
		tf.transform(new DOMSource(doc), new StreamResult(new FileOutputStream("src/book.xml")));
	}

}
