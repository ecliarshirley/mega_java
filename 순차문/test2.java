package 순차문;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력하세요: ");
		int a = sc.nextInt();
		System.out.println("두 번째 숫자를 입력하세요: ");
		int b = sc.nextInt();
		
		
		if (a == b) {
			System.out.println("두 수가 같습니다.");
		} else {
			System.out.println("두 수가 다릅니다.");
		}
		
		
	}

}
