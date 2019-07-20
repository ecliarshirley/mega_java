package 배열;

import java.util.Scanner;

public class 배열5 {

	public static void main(String[] args) {
		//성적 관리 프로그램
		
		int [] jumsu = new int[5];

		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < jumsu.length; i++) {
			System.out.print("점수 입력>>");
			int data = sc.nextInt();
			jumsu[i] = data;
		}
		System.out.println("점수 출력:");
				
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(jumsu[i]);
		}
		
		
		int imsi; //기본형
		//초기화 되지 않았음.
		//쓰레기값이 들어있음. 프린트 할 수 없음
//		System.out.println(imsi);
		
		int[] imsi2 = new int[3]; //참조형
//		System.out.println(imsi2[0]);
		//배열은 자동초기화를 해 준다.
		//int -> 0  , double -> 0.0
		
	}

}
