package ������;

import java.util.Scanner;

public class ȸ����������test {

	public static void main(String[] args) {
		System.out.println("=====================");
		System.out.println("ȸ������ ����");
		System.out.println("---------------------");
		
		Scanner test = new Scanner(System.in);
		System.out.print("�̸�: ");
		String name = test.next();
		System.out.print("���̵� :");
		String id = test.next();
		System.out.print("���: ");
		String pw = test.next();
		System.out.print("����ó: ");
		String contact = test.next();
		
		System.out.println("---------------------");
		System.out.println(name +","+ id +","+ pw +","+ contact);
		
	}

}
