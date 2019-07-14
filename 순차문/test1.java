package 순차문;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		System.out.println("-----------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("오늘의 기온은? ");
		int temp = sc.nextInt();
		
		System.out.print("오늘 나의 평가는? ");
		String evalu = sc.next();
		
		System.out.print("나의 신발 사이즈는? ");
		double shoe = sc.nextDouble();
		
		System.out.println("-----------------");
		System.out.println("오늘은 "+ temp + "도," + 
		"나의 평가는" + evalu + ", 신발은" + shoe);
		
		
	}

}
