package �迭;

import java.util.Scanner;

public class ��ռ��� {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		
		int[] num = new int[5];
		int sum = 0;
		
		for (int i = 0; i < num.length; i++) {
			System.out.println("������ �Է��Ͻÿ�");
			num[i] = sc.nextInt();
			sum = sum + num[i];
		}
		System.out.print("��� ������:" + sum/num.length);
		
	}

}
