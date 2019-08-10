package test;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum;

			System.out.print("이름을 입력하세요>> ");
			String name = sc.next();
			System.out.print("국어 점수를 입력하세요>> ");
			int kr = sc.nextInt();
			System.out.print("영어 점수를 입력하세요>> ");
			int eng = sc.nextInt();
			System.out.print("수학 점수를 입력하세요>> ");
			int maths = sc.nextInt();
			sum = kr + eng + maths;
			
		System.out.println(name + "의 총점은: " + sum);
		System.out.println(name + "의 평균은: " + sum / 3);

	}

}
