	package ����;

import java.util.Scanner;

public class ��ռ���1�� {

	public static void main(String[] args) {
		String name;
		String company;
		int score = 0;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է�>>");
		name = sc.next();
		System.out.print("�Ҽ��� �Է�>>");
		company = sc.next();
				
		
		for (int i = 0; i < 3; i++) {
			System.out.print(name +"�� ���� 3���� �Է��ϼ���");
			score = sc.nextInt();
			sum= sum + score;
		}
		
		System.out.println(company + "�� " + name +"�� ������ " + sum + "���̰�,");
		System.out.println("�����" + sum/3 + "�� �Դϴ�.");
	}

}
