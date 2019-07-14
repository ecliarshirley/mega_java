package 순차문;

import java.util.Scanner;

public class 실적목표복습 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("실적목표: 1000");
		System.out.print("입력값: ");
		
		int target = sc.nextInt();
		
		if (target >= 1000) {
			System.out.println("달성");
		} else {
			System.out.println("노");
		}
		
		
	}

}
