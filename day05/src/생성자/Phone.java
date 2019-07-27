package 생성자;

public class Phone {

	String color;
	int size;
	
	//객체생성시 자동호출
	//생성자 constructor
	//입력값이 없는 생성자: 기본생성자 default.
	//자동으로 만들어줌
	public Phone() {
		System.out.println("내가 자동 호출 됨.");
	}
	
	// 빨강, 7
	public Phone(String c, int s) {
		color = c;
		size = s;				
	}
	
	@Override
	public String toString() {
		return color + ", " +size;
	}
	
}
