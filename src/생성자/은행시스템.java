package 생성자;

import java.util.Scanner;

public class 은행시스템 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Account a = null;  //메모리 할당
		
		while (true) { //무한루프
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("-----------------------------------------");
			
			System.out.print("선택>> ");
			int input = sc.nextInt();
			
			if (input == 1) { //계좌생성
				System.out.println("--------");
				System.out.println("계좌생성");
				System.out.println("--------");
				
				System.out.print("계좌번호:");
				String data1 = sc.next();
				System.out.print("계좌주: ");
				String data2 = sc.next();
				System.out.print("초기입금액:");
				int data3 = sc.nextInt();
				
				a = new Account(data1, data2, data3);
				System.out.println("결과: 계좌가 생성되었습니다.");
				
			} else if (input ==2) { //계좌목록
				System.out.println(a); //toString 메소드 호출
				
				
			} else if (input ==3) { //예금
				//a.total에 더함
		
				System.out.print("예금액: ");
				int data4 = sc.nextInt();
				a.total= a.total + data4;
				
				System.out.println("현재금액:" + a.total);
				
			} else if (input ==4) { //출금

				System.out.print("출금액: ");
				int data5 = sc.nextInt();
				a.total= a.total - data5;
				
				System.out.println("현재금액:" + a.total);
				
			} else { //5일때.
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		}
		sc.close();
	}

}
