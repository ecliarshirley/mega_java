package �迭;

import java.util.Scanner;

public class ����ǥ��� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] student = null;  //array�� ����

		while (true) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� |5.����");
			System.out.println("---------------------------------------------------");
			System.out.print("����> ");
			int opt = sc.nextInt();

			if (opt == 1) {
				System.out.print("�л��� >");
				int no = sc.nextInt();
				student = new int[no];   //�ڽ�array�� �ִ´�

			} else if (opt == 2) {
				for (int i = 0; i < student.length; i++) {
					System.out.print("student����[" + i + "] >");
					student[i] = sc.nextInt();   //student[0]�� ���� ����~
				}  

			} else if (opt == 3) {
				//array ������� ���
				for (int i = 0; i < student.length; i++) {
					System.out.println("student[" + i +"] >" + student[i]);
				}

			} else if (opt == 4) {
				int max = student[0];  //���� �ȿ��� ����
				for (int i = 0; i < student.length; i++) {
					if(student[i] > max)
						max = student[i];
				}
				System.out.println("�ְ� ����: " + max);
				
				int sum = 0;
				for (int i = 0; i < student.length; i++) {
					sum = sum + student[i];
				}
				System.out.println( "���:" + sum/student.length);
				
				
			} else if (opt == 5) {
				System.out.println("���α׷��� �����մϴ�");
				break;
			}

		}

	}

}
