package �ݺ���;

import java.util.Scanner;

public class WhileTest6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int target = 50;
		//ctrl + shift + f : �ڵ� ����
		while (true) {
			System.out.println("������ ���ڸ� �Է��ϼ���: ");
			int data = sc.nextInt();
			if(data == target) {
				System.out.println("�����մϴ�. �����Դϴ�.");
				break; //�ݺ��� ����
			}
			else {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է�");
			}
			
		}
		
	}

}
