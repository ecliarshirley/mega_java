package �迭;

import java.util.Scanner;

public class �ִ밪ã�� {

	public static void main(String[] args) {
		int[] num = new int[5];
		
		Scanner	sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.print("���ڸ� �Է��ϼ���:");
//			int data = sc.nextInt();
//			num[i] = data;
			
			num[i] = sc.nextInt();
			
		}
		
		
		int max = num[0];
		for (int i = 0; i < num.length; i++) {
			if(num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("�ִ� ����: " + max);
		
		int min = num[0];
		for (int i = 0; i < num.length; i++) {
			if(num[i]<min) {
				min = num[i];
			}
		}
		System.out.println("�ּ� ����: " + min);
		
		
	}

}
