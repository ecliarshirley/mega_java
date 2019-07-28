package 스태틱;

public class 창업문제 {

	String name;
	int age;
	String gender;
	static int sum;  //직원총 나이
	static int avg;  //직원 평균나이
	static int count;  //직원수
	
	public 창업문제(String name, int age, String gender) {
		count++;
		sum = sum + age;
		avg = sum / count;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "창업문제 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
	
}
