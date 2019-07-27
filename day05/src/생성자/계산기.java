package 생성자;

public class 계산기 {
	//오버로딩(다형성)
	//"하나의 이름으로" 다양한 형태를 구현한다.
	//메소드 이름 똑같이 쓸 수 있다
	public void add() {
		System.out.println("더하기 기능");
	}
	public void add(int x, int y) {
		System.out.println("두 수의 합: " + (x + y));
	}
	public void add(String x, String y) {
		System.out.println("두 단어 결합: " + (x + y));
	}
	
	
}
