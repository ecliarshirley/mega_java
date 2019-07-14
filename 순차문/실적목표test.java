package 순차문;

import java.util.Scanner;

public class 실적목표test {

	public static void main(String[] args) {
		System.out.println("실적 목표: 1000");
		System.out.print("입력값: ");
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		
		if (target >= 1000) {
			System.out.println("축하!!! 실적달성");
			double bonus = target * 0.2;
			System.out.println("당신의 보너스는" + (int)bonus +"백만원");
		} else {
			System.out.println("안타깝네요!!! 실적미달성");
		}
		
		
		
	}

}
