package ������;

import java.util.Scanner;

public class �ֹι�ȣ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹι�ȣ �Է�. (-����)");
		String sn = sc.next();
		
		//charAt(��ġ��): String���� char �� ���ڸ� ������ �� ���
		char gender = sn.charAt(6);
		System.out.println(gender);
		
		//character�� single ����ǥ ��� �Ѵ�
		
		switch (gender) {
		case '1':
		case '3':
			System.out.println("��");
			break;
		case '2':
		case '4':
			System.out.println("��");
			break;
		default:
			System.out.println("�߸����̳׿�");
			break;
		}
		
	}

}
