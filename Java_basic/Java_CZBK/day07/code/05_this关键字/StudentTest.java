/*
	��������Ի��������Ҫ��������֪�⡣
	
	this:�ǵ�ǰ��Ķ������á��򵥵ļǣ����ʹ���ǰ���һ������
	
		ע�⣺˭��������������ڸ÷����ڲ���this�ʹ���˭��
		
	this�ĳ�����
		����ֲ��������س�Ա����
*/
//����ѧ����
class Student {
	//����
	private String name;
	//����
	private int age;
	
	//������ȡֵ
	public String getName() {
		return name;
	}
	
	//��������ֵ
	public void setName(String name) { //name = "����ϼ";
		//name = name; //������ʹ�ù��򣺾ͽ�ԭ��
		//������������Ŀǰ��û��˵�����Ƶ��÷�������������������
		//����ĵ���ֻ��ͨ��������
		//�������������ڣ���Ӧ�ô������Student��һ������
		//��ô��˭�ܹ�����ǰ��Ķ�����? java���ṩ��һ���ؼ��� this
		//Student.name = name;
		this.name = name;
	}
	
	//�����ȡֵ
	public int getAge() {
		return age;
	}
	
	//���丳ֵ
	public void setAge(int age) {
		this.age = age;
	}
}

//������
class StudentTest {
	public static void main(String[] args) {
		//����ѧ������
		Student s = new Student();
		
		//����Ա������ֵ
		s.setName("����ϼ");
		s.setAge(27);
		//��ȡ����
		System.out.println(s.getName()+"---"+s.getAge());
	}
}