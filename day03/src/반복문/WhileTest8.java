package �ݺ���;

import java.util.Random;
import java.util.Scanner;

public class WhileTest8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Random r = new Random();
		int target = r.nextInt(100);
		int count = 0;

		while (true) {
			count++;
			System.out.println("������ ���ڸ� �Է��ϼ���");
			int data = sc.nextInt();

			if (data == target) {
				System.out.println("�����մϴ�. �­����ϴ�.");
				System.out.println("����� ������ Ƚ����: " + (count-1) + "ȸ");
				break;
			} else {
				if (data > target) {
					System.out.println("�ʹ� Ů�ϴ�");
				} else {
					System.out.println("�ʹ� �۽��ϴ�.");
				}

				System.out.println("�ٽ��ϼ���");
			}

		}

	}

}
