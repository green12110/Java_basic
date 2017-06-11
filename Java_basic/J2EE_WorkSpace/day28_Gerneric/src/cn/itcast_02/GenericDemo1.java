package cn.itcast_02;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * 泛型：告诉编译器如何做，可以限定集合中的输入类型，取容器元素的时候不需要强制类型转换了。
 * 编译后，去掉类型信息。
 * 注意：可以通过反射来，存入不通过的类型的元素。
 *     因为反射只与运行期相关
 * @author Administrator
 *
 */

public class GenericDemo1 {
	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Collection<String> collection1 = new ArrayList<String>();
		ArrayList<Integer> collection2 = new ArrayList<Integer>();
	    System.out.println(collection1.getClass() == collection2.getClass());
	    //true, 字节码文件相同
	    
	    //向collection2中添加元素
	    collection2.add(12);
	    collection2.add(32);
	    
	    //通估反射，添加一个String类型的元素
	    collection2.getClass().getMethod("add", Object.class).invoke(collection2, "adb");
	    
	    
	    //遍历collection2
	    for(int i=0;i<collection2.size();i++){
	    	System.out.println(collection2.get(i));
	    	
	    }
	}

}
