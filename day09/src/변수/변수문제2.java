package 변수;

public class 변수문제2 {

	public static void main(String[] args) {
		byte b = 100; 	//1바이트 (127)
		int i = b;		//4바이트 <--1바이트
		//작 --> 큰 : 자동형변환
		
		int i2 = 100;  	//4바이트
		byte b2 = (byte)i2;	//byte에 들어가고 싶으면 바이트 127 안의 크기만 작게 줄이기 가능.
		//큰 --> 작 : 강제형변환
		
		//형변환 (=casting)
		//큰 <--- 작 : 자동형변환
		byte b3 = 100;		//1바이트
		long l1 = b3;		//8바이트
		
		//작 <--- 큰: 강제형변환
		long l2 = 100L;		//long은 뒤에 L을 써야.
		int i3 = (int)l2;
		
	}

}
