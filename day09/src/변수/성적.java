package ����;

import java.util.Scanner;

public class ���� {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
				
		for (int i = 0; i < 5; i++) {
			System.out.println("5���� �л� ������ �����ϼ���:");
			int score = sc.nextInt();
			sum = sum + score;
		}
		System.out.println("sum "+ sum);
		System.out.println("average " + sum/5);
		
	}
}
