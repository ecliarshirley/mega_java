package 순차문;

import java.util.Scanner;

public class 주민번호 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력. (-제외)");
		String sn = sc.next();
		
		//charAt(위치값): String에서 char 한 글자를 추출할 때 사용
		char gender = sn.charAt(6);
		System.out.println(gender);
		
		//character는 single 따옴표 써야 한다
		
		switch (gender) {
		case '1':
		case '3':
			System.out.println("남");
			break;
		case '2':
		case '4':
			System.out.println("여");
			break;
		default:
			System.out.println("잘못쓰셨네요");
			break;
		}
		
	}

}
