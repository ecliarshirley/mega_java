package ������;

import java.util.Scanner;

public class ��Ʈ���� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ� 2�� �Է�:");
		String s1 = sc.next();
		String s2 = sc.next();
		
		//String s1 = "java";
		//String s2 = "python";
		
		if(s1.equals(s2)) {
			System.out.println("����");
		} else {
			System.out.println("����x");
		}
		
		System.out.println("�λ� �¿�� �Է�:");
		sc.nextLine();  //������ enter ģ ��
		String life = sc.nextLine();
		System.out.println("�Է��� �¿��: " + life);
		
	}

}
