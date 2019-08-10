package 변수;

import java.util.Scanner;

public class 성적 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
				
		for (int i = 0; i < 5; i++) {
			System.out.println("5명의 학생 성적을 기입하세요:");
			int score = sc.nextInt();
			sum = sum + score;
		}
		System.out.println("sum "+ sum);
		System.out.println("average " + sum/5);
		
	}
}
