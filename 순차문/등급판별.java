package ������;

import java.util.Scanner;

public class ����Ǻ� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ����� ��ȣ�� �Է��ϼ���:");
		System.out.println("��) C573");
		String sn = sc.next();
		
		char staff = sn.charAt(0);
		System.out.println(staff);
		
		switch (staff) {
		case 'A':
			System.out.println("�ֿ�� �Դϴ�");
			break;
		case 'B':
			System.out.println("��� �Դϴ�");
			break;
		case 'C':
			System.out.println("���� �Դϴ�");
			break;

		default:
			System.out.println("������� �ʾҽ��ϴ�.");
			break;
		}
		
	}

}
