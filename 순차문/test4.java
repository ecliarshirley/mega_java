package ������;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------------------");
		System.out.println("Ű���� ����: ");
		int KeyBoardPrice = sc.nextInt();
		System.out.println("Ű���� ����: ");
		int KeyBoardNumber = sc.nextInt();
		
		System.out.println("���콺 ����: ");
		int MousePrice = sc.nextInt();
		System.out.println("���콺 ����: ");
		int MouseNumb = sc.nextInt();
				
				
				
		
		System.out.println("Ű���� �� ����: " + KeyBoardNumber * KeyBoardPrice);
		System.out.println("���콺 �� ����: " + MouseNumb * MousePrice);
		System.out.println("��ǰ �� ����: " );
	}

}
