package 순차문;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("다음의 영수증을 출력하세요. (부가세는 10%)");
				
		System.out.println("받은돈: ");
		int money = sc.nextInt();
		
		System.out.println("상품의 총액: ");
		int price = sc.nextInt();
		
		
		double tax = price * 0.1;
		
		System.out.println("부가세: " + (int)tax); 
		System.out.println("잔돈: " + (money - price - (int)tax) );
		
		
	}

}
