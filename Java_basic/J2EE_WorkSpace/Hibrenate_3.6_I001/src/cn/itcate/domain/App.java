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
		cfg.configure("hibernate.cfg.xml");   // 读取配置文件
		sessionFactroy = cfg.buildSessionFactory();            // 生产会话工厂
	}

	@Test
	public void testSave() {

		User user = new User();
		user.setId(1000);
		user.setName("zhangsan");

		// 保存
		Session session = sessionFactroy.openSession();  //打开一个新的session
		Transaction tx = session.beginTransaction();     //开始事务
		session.save(user);
		tx.commit();       //提交事务
        sessionFactroy.close();
	}

	@Test
	public void testGet() {
		Session session = sessionFactroy.openSession();
		Transaction tx = session.beginTransaction();
		// 获取
		User user = (User) session.get(User.class, 1000);
		System.out.println(user);
		tx.commit();       //提交事务
		session.close();

	}

}
