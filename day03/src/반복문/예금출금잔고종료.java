package 반복문;

import java.util.Scanner;

public class 예금출금잔고종료 {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);

		int money = 10000; 
		
		while(true) {
			System.out.println("-----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-----------------------------------");
			
			System.out.println("선택>>");
			int opt = sc.nextInt(); 
			
			if (opt == 1) {
				System.out.println("예금액>");
				int moneyPlus = sc.nextInt();
				money = money + moneyPlus;
				
			} else if (opt ==2) {
				System.out.println("출금액>");
				int moneyMinus = sc.nextInt();
				money = money - moneyMinus;
								
			} else if (opt ==3) {
				System.out.println("잔고>" + money);
			
			} else if (opt == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		}
		
		
		
	}

}
