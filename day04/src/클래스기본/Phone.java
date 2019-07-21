package 클래스기본;

public class Phone {

//		휴대폰 => CLASS
//				- 정적인 특징: 모양, 사이즈
		
	String shape;
	int size;
				
//				- 동적인 특징: 전화하다, 카톡하다 = > 베소드 (함수와 동일)
		
	public void call() {
	System.out.println("전화하다.");
	}
	
	public void katalk() {
		System.out.println("카톡하다.");
	}

}
