package ����ƽ;

public class â������ {

	String name;
	int age;
	String gender;
	static int sum;  //������ ����
	static int avg;  //���� ��ճ���
	static int count;  //������
	
	public â������(String name, int age, String gender) {
		count++;
		sum = sum + age;
		avg = sum / count;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "â������ [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
	
}
