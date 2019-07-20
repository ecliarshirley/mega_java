package 반복문;

import java.util.Scanner;

public class 증속감속중지 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int speed = 100;
		
		while(true) {
			System.out.println("--------------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("--------------------------");
			
			System.out.print("선택:");
			
			int data = sc.nextInt();
			
			if (data==1) {
				System.out.println("증속값:");
				int data2 = sc.nextInt();
				speed =speed + data2;
				System.out.println("현재 속도: " + speed);
			} else if (data==2) {
				System.out.println("감속값:");
				int data3 = sc.nextInt();
				speed = speed - data3;
				System.out.println("현재 속도: " + speed);
			}else if (data==3) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		
		
		
	}

}
