package ������;

import java.util.Scanner;

public class ������ǥtest {

	public static void main(String[] args) {
		System.out.println("���� ��ǥ: 1000");
		System.out.print("�Է°�: ");
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		
		if (target >= 1000) {
			System.out.println("����!!! �����޼�");
			double bonus = target * 0.2;
			System.out.println("����� ���ʽ���" + (int)bonus +"�鸸��");
		} else {
			System.out.println("��Ÿ���׿�!!! �����̴޼�");
		}
		
		
		
	}

}
