package 예외처리;

public class 예외처리테스트2 {

	public static void main(String[] args) {
		
		try {
			//에러가 발생할 것 같은 코드 넣는다.
			int[] num = {1,2};
			num[2] = 3; //에러 발생
			
		} catch (Exception e) {
			//에러 처리 내용 코드 넣는다.
			e.printStackTrace();
			System.out.println("에러발생!");
		}
		System.out.println("내가 실행 될 까요?");
		
	}

}
