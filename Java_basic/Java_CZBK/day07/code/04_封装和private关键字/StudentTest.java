/*
	��װ��private��Ӧ�ã�
		A:�ѳ�Ա������private����
		B:��߶�Ӧ��getXxx()��setXxx()����
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
	public void setName(String n) {
		name = n;
	}
	
	//�����ȡֵ
	public int getAge() {
		return age;
	}
	
	//���丳ֵ
	public void setAge(int a) {
		age = a;
	}
}

//������
class StudentTest {
	public static void main(String[] args) {
		//����ѧ������
		Student s = new Student();
		
		//ʹ�ó�Ա����
		//���󣺱�˽�������ˣ���粻��ֱ�ӷ�����
		//System.out.println(s.name+"---"+s.age);
		System.out.println(s.getName()+"---"+s.getAge());
		
		//����Ա������ֵ
		//s.name = "����ϼ";
		//s.age = 27;
		//ͨ����������ֵ
		s.setName("����ϼ");
		s.setAge(27);
		System.out.println(s.getName()+"---"+s.getAge());
	}
}