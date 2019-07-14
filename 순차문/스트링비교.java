package 순차문;

import java.util.Scanner;

public class 스트링비교 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 2개 입력:");
		String s1 = sc.next();
		String s2 = sc.next();
		
		//String s1 = "java";
		//String s2 = "python";
		
		if(s1.equals(s2)) {
			System.out.println("동일");
		} else {
			System.out.println("동일x");
		}
		
		System.out.println("인생 좌우명 입력:");
		sc.nextLine();  //위에것 enter 친 것
		String life = sc.nextLine();
		System.out.println("입력한 좌우명: " + life);
		
	}

}
