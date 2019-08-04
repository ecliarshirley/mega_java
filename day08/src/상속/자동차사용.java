package 상속;

public class 자동차사용 {

	public static void main(String[] args) {
		System.out.println("세단");
		세단 s = new 세단();
		s.color = "빨강";
		s.name = "세련 세단";
		s.start();		//자동차
		s.windowOpen();	//세단
		
		System.out.println(s);  //toString 내용이 잘 찍힌다
		
		System.out.println("--------------------");
		System.out.println("트럭");
		트럭 t = new 트럭();
		t.color = "파랑";
		t.name = "누비다트럭";
		t.move();
		System.out.println(t);
		
	}

}
