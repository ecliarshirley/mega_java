package test;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum;

			System.out.print("�̸��� �Է��ϼ���>> ");
			String name = sc.next();
			System.out.print("���� ������ �Է��ϼ���>> ");
			int kr = sc.nextInt();
			System.out.print("���� ������ �Է��ϼ���>> ");
			int eng = sc.nextInt();
			System.out.print("���� ������ �Է��ϼ���>> ");
			int maths = sc.nextInt();
			sum = kr + eng + maths;
			
		System.out.println(name + "�� ������: " + sum);
		System.out.println(name + "�� �����: " + sum / 3);

	}

}
