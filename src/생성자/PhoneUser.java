package 생성자;

public class PhoneUser {

	public static void main(String[] args) {
		//객체 생성
		Phone p1 = new Phone("빨강", 7);
//		System.out.println(p1.color);
//		System.out.println(p1.size);
		
		System.out.println(p1);
		
		
		//전화기 객제 생성 프린트
		//검정, 10
		
		Phone p2 = new Phone("검정", 10);
		System.out.println(p2);
		
	}

}
