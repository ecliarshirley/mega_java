package �迭;

import java.util.Scanner;

public class �迭5 {

	public static void main(String[] args) {
		//���� ���� ���α׷�
		
		int [] jumsu = new int[5];

		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < jumsu.length; i++) {
			System.out.print("���� �Է�>>");
			int data = sc.nextInt();
			jumsu[i] = data;
		}
		System.out.println("���� ���:");
				
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(jumsu[i]);
		}
		
		
		int imsi; //�⺻��
		//�ʱ�ȭ ���� �ʾ���.
		//�����Ⱚ�� �������. ����Ʈ �� �� ����
//		System.out.println(imsi);
		
		int[] imsi2 = new int[3]; //������
//		System.out.println(imsi2[0]);
		//�迭�� �ڵ��ʱ�ȭ�� �� �ش�.
		//int -> 0  , double -> 0.0
		
	}

}
