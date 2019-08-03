package 예외처리;

public class 예외처리테스트3 {
//javac(번역기 프로그램)
//java (실행 프로그램)
	public static void main(String[] args) {
		try {
			System.out.println(4/0);
			
		} catch (Exception e) {
			//에러 처리
			System.out.println("에러가 발생함!");
			e.printStackTrace();
			
		}
		System.out.println("에러 처리 완료");
		
	}

}
