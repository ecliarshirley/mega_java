package �ݺ���;

import java.util.Scanner;

public class WhileTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		while (true) {
			System.out.print("�Է�(���� 0): ");
			int data = sc.nextInt();
			if(data ==0) {
				System.out.println("���α׷��� �����մϴ�.");
				break; //�ݺ��� ����
			}
			System.out.println("Ȯ��: " + data);
			
			//sum ���ٰ� �Է°� ��� ���غ�����.
			//��������� sum ���� ���
			
			sum = sum + data;
			System.out.println("���հ��: " + sum);
			
		}
		
		System.out.println("���հ��:" + sum);
	}

}
