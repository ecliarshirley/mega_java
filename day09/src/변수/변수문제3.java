package 변수;

public class 변수문제3 {

	public static void main(String[] args) {

		int num = 10;
		
		try {
			System.out.println(num/0);
		} catch (Exception e) {
			//에러가 발생한 순간에 처리
			System.out.println("에러 발생했는데 처리함.");
		} finally {
			//에러발생 유무와 상관없이 무조건 실행하고자 하는 경우
			System.out.println("무조건 나는 실행.");
			//파일과의 연결을 무조건 close! 해 줘야 하는 경우에 쓰임 (FileWriter)
			
			//네트워크 연결을 끊어야 하는 경우!
			
		}
		
	}

}
