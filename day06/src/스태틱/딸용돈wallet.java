package ����ƽ;

public class ���뵷wallet {

	public static int wallet = 10000;
	public static int count;
	public String name;
	public int age;
	
	public ���뵷wallet(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + ", " + age ;
	}

	
	
	
}
