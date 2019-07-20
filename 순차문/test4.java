package 순차문;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------------------");
		System.out.println("키보드 가격: ");
		int KeyBoardPrice = sc.nextInt();
		System.out.println("키보드 갯수: ");
		int KeyBoardNumber = sc.nextInt();
		
		System.out.println("마우스 가격: ");
		int MousePrice = sc.nextInt();
		System.out.println("마우스 갯수: ");
		int MouseNumb = sc.nextInt();
				
				
		int KeyBoardTotPrice = KeyBoardNumber * KeyBoardPrice;
		int MouseTotPrice = MouseNumb * MousePrice;
				
		
		System.out.println("키보드 총 가격: " + KeyBoardTotPrice);
		System.out.println("마우스 총 가격: " + MouseTotPrice);
		System.out.println("제품 총 가격: " + KeyBoardTotPrice + MouseTotPrice);
	}

}
