package ������;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �������� ����ϼ���. (�ΰ����� 10%)");
				
		System.out.println("������: ");
		int money = sc.nextInt();
		
		System.out.println("��ǰ�� �Ѿ�: ");
		int price = sc.nextInt();
		
		
		double tax = price * 0.1;
		
		System.out.println("�ΰ���: " + (int)tax); 
		System.out.println("�ܵ�: " + (money - price - (int)tax) );
		
		
	}

}
