package ������;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		System.out.println("-----------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �����? ");
		int temp = sc.nextInt();
		
		System.out.print("���� ���� �򰡴�? ");
		String evalu = sc.next();
		
		System.out.print("���� �Ź� �������? ");
		double shoe = sc.nextDouble();
		
		System.out.println("-----------------");
		System.out.println("������ "+ temp + "��," + 
		"���� �򰡴�" + evalu + ", �Ź���" + shoe);
		
		
	}

}
