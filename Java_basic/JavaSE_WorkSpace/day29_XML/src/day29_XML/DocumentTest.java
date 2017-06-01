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

//��xml�ĵ�����crud����
public class DocumentTest {

	// ���ж�����
	@Test
	public void testRead() throws Exception {
		File f = new File("src/book.xml");
		Document doc = XMLDocumentDemo.getDocument(f);

		// NodeList getElementsByTagName(String tagname)
		// ���ĵ�˳�򷵻ذ������ĵ����Ҿ��и���������Ƶ����� Element �� NodeList
		NodeList nodelist = doc.getElementsByTagName("��");
		int length = nodelist.getLength();
		Node n1 = nodelist.item(0);
		String name = n1.getNodeName();
		String cont = n1.getTextContent();
		// Node n2 = nodelist.item(1);
		System.out.println(length);
		System.out.println(name + "==" + cont);
	}

	// ��ȡxml���б�ǩ
	@Test
	public void testReadAll() throws Exception {
		File f = new File("src/book.xml");
		Document doc = XMLDocumentDemo.getDocument(f);
		// �õ����ڵ�
		Node root = doc.getElementsByTagName("���").item(0);
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

	// �õ�xml��ǩ�����Ե�ֵ <���� name="xxxx">ƽ��������</����>
	@Test
	public void testGetAtt() throws Exception {
		File f = new File("src/book.xml");
		Document doc = XMLDocumentDemo.getDocument(f);
		// �õ���ǩ
		Element root = (Element) doc.getElementsByTagName("����").item(0);
		String value = root.getAttribute("name");
		System.out.println(value);
	}

	// ��xml�ĵ�����ӽڵ� <�ۼ�>59.00Ԫ<�ۼ�/>
	@Test
	public void testAdd() throws Exception {
		File f = new File("src/book.xml");
		Document doc = XMLDocumentDemo.getDocument(f);
		//�����ڵ�
		Element element = doc.createElement("�ۼ�");
		element.setTextContent("59.00Ԫ");
		// �õ���ǩ
		Element root = (Element)doc.getElementsByTagName("��").item(0);
		//Ĭ������������һ������
		root.appendChild(element);
		//��������
		TransformerFactory tffactory = TransformerFactory.newInstance();
		//�õ�Transfomerʵ��
		Transformer tf = tffactory.newTransformer();
		//ת��
		tf.transform(new DOMSource(doc), new StreamResult(new FileOutputStream("src/book.xml")));
	}

}
