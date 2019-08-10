package 변수;

import java.util.Scanner;

public class 계좌사용 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 2; i++) {
			System.out.print("계좌명 입력>> ");
			String data1 = sc.next();
			System.out.print("계좌주 입력>> ");
			String data2 = sc.next();
			System.out.print("초기 입금액>> ");
			int data3 = sc.nextInt();
			계좌 a1 = new 계좌(data1, data2, data3);
			System.out.println(a1);
		}
	}

}
