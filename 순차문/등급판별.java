package 순차문;

import java.util.Scanner;

public class 등급판별 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("본인의 사원증 번호를 입력하세요:");
		System.out.println("예) C573");
		String sn = sc.next();
		
		char staff = sn.charAt(0);
		System.out.println(staff);
		
		switch (staff) {
		case 'A':
			System.out.println("최우수 입니다");
			break;
		case 'B':
			System.out.println("우수 입니다");
			break;
		case 'C':
			System.out.println("보통 입니다");
			break;

		default:
			System.out.println("통과하지 않았습니다.");
			break;
		}
		
	}

}
