package �迭;

import java.util.Scanner;

public class �迭��������ȭ3 {

	public static void main(String[] args) {
		int[][] seat2 = new int[10][10];
		Scanner sc = new Scanner(System.in);

			
		
		while (true) {
			System.out.print("   ");
			for (int i = 0; i < seat2.length; i++) {
				System.out.print(i + " ");
			}
			System.out.println("\n-----------------------");
			for (int i = 0; i < seat2.length; i++) {
				System.out.print(i + ": ");
				for (int j = 0; j < seat2[i].length; j++) {
					System.out.print(seat2[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
			System.out.print("�� �Է�(����� -1): ");
			int row = sc.nextInt();
			if(row == -1) {
				System.out.println("���� �����մϴ�.");
				break;
			}
			System.out.print("�� �Է�: ");
			int col = sc.nextInt();
			
			if (seat2[row][col] != 1) {
				seat2[row][col] = 1;
				System.out.println("\n������ �Ϸ� �Ǿ����ϴ�!");
			} else {
				System.out.println("�̹� ����� �ڸ� �Դϴ�. �ٸ� �ڸ��� ������ �ּ���.");
			}
			
		}
		
		
		
	}

}
