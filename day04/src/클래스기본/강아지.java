package 클래스기본;

public class 강아지 {
	//정적인 특징
	// 다리 4개. 눈, 코, 입, 귀, 꼬리
	int leg; //개수
	String tail; //색
	
	
	//동적인 특징
	// 짖기, 꼬리 흔들기, 애교부리기
	
	public void bark() {
		System.out.println("짖기");
		
	}
	
	public void swing() {
		System.out.println("꼬리 흔들기");
	}
	
	public void cute() {
		System.out.println("애교부리기");
	}
}
