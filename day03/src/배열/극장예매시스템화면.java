package �迭;

import java.util.Scanner;

public class ���忹�Žý���ȭ�� {

	public static void main(String[] args) {
		int[] seat = new int[10];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while (true) {
			System.out.println("----------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("----------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.println();
			System.out.println("----------------------");
			System.out.print("���� �¼� ��ȣ �Է�(����: -1)>>");
			int data = sc.nextInt();
			
			if (data == -1) {
				int total = count * 10000;
				System.out.println("���Žý��� ����");
				System.out.println("����� ������ �� �ݾ���:" + total + "�� �Դϴ�.");
				break;
			}

			if (seat[data] == 0) {
				System.out.println("���ڸ��׿� ���� �����մϴ�");
				seat[data] = 1;
				count++;
				System.out.println("���Ű� �Ϸ� �Ǿ����ϴ�.");
			} else if (seat[data] == 1) {   //else{ �� �ص� ������
				System.out.println("�ڸ��� á���ϴ�");
				System.out.println("�ٽ� �¼��� �������ּ���");
			} 
		}

	}

}
