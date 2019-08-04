package 상속;

public class ManagerUser {

	public static void main(String[] args) {
		Manager m = new Manager();
		m.name = "홍길동";
		m.address = "강남구";
		m.salary = 300;
		m.rrn = 880101;
		m.bonus = 1000;
		
		m.test();
		
		System.out.println(m);
	}

}
