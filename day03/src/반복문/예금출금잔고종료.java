package �ݺ���;

import java.util.Scanner;

public class ��������ܰ����� {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);

		int money = 10000; 
		
		while(true) {
			System.out.println("-----------------------------------");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("-----------------------------------");
			
			System.out.println("����>>");
			int opt = sc.nextInt(); 
			
			if (opt == 1) {
				System.out.println("���ݾ�>");
				int moneyPlus = sc.nextInt();
				money = money + moneyPlus;
				
			} else if (opt ==2) {
				System.out.println("��ݾ�>");
				int moneyMinus = sc.nextInt();
				money = money - moneyMinus;
								
			} else if (opt ==3) {
				System.out.println("�ܰ�>" + money);
			
			} else if (opt == 4) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
		}
		
		
		
	}

}
