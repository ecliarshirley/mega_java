package 변수;

public class Me {

	public static void main(String[] args) {
		byte age;	//선언 => 메모리 공간 확보
		age = 100; // =  할당연산자, 대입연산자 기호
		
		int money = 10;
		
		double weight = 100;
		float eye = 1.5f;
		
		char gender = 'F';
		String name = "홍길동";
		
		boolean lunch = true;
		
		// + : 결합연산자
		System.out.println("내 이름은 :" + name);
		System.out.println("age:" + age );
		System.out.println("money:" + money);
		System.out.println("weight:" + weight);
		System.out.println("내 시력은: " + eye);
		System.out.println("내 성별은:" + gender);
		System.out.println("점심은 맛있게 드셨나요?:" + lunch);
	}

}
