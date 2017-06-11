package cn.reflect_main;

import java.io.FileReader;
import java.util.Collection;
import java.util.Properties;

/**
 * 框架的例子
 * 工具类：自己调用别人的写好的东西
 * 框架：别人写好的东西调用自己
 *     自己的还没有写，如何调用？
 *     ——用反射(从配置文件中读取出来类名)
 * @author Administrator
 *
 */

public class ReflectDemo {
	
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("config.properties");
		Properties props = new Properties();
		props.load(fr);
		fr.close();
		
		//得到配置文件中，key对应的value值
		String className = props.getProperty("className");
		Collection c = (Collection)Class.forName(className).newInstance();
		c.add("Java");
		c.add("C++");
		
		System.out.println(c.size());
	}

}
