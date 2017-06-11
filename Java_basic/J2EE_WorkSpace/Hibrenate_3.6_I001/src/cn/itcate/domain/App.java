package cn.itcate.domain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class App {

	private static SessionFactory sessionFactroy;

	static {
		Configuration cfg = new Configuration();	
		cfg.configure("hibernate.cfg.xml");   // ��ȡ�����ļ�
		sessionFactroy = cfg.buildSessionFactory();            // �����Ự����
	}

	@Test
	public void testSave() {

		User user = new User();
		user.setId(1000);
		user.setName("zhangsan");

		// ����
		Session session = sessionFactroy.openSession();  //��һ���µ�session
		Transaction tx = session.beginTransaction();     //��ʼ����
		session.save(user);
		tx.commit();       //�ύ����
        sessionFactroy.close();
	}

	@Test
	public void testGet() {
		Session session = sessionFactroy.openSession();
		Transaction tx = session.beginTransaction();
		// ��ȡ
		User user = (User) session.get(User.class, 1000);
		System.out.println(user);
		tx.commit();       //�ύ����
		session.close();

	}

}
