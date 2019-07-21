package 배열;

import java.util.Scanner;

public class 평균성적 {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		
		int[] num = new int[5];
		int sum = 0;
		
		for (int i = 0; i < num.length; i++) {
			System.out.println("성적을 입력하시오");
			num[i] = sc.nextInt();
			sum = sum + num[i];
		}
		System.out.print("평균 성적은:" + sum/num.length);
		
	}

}
