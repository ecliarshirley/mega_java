	package 변수;

import java.util.Scanner;

public class 평균성적1인 {

	public static void main(String[] args) {
		String name;
		String company;
		int score = 0;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력>>");
		name = sc.next();
		System.out.print("소속을 입력>>");
		company = sc.next();
				
		
		for (int i = 0; i < 3; i++) {
			System.out.print(name +"의 성적 3개를 입력하세요");
			score = sc.nextInt();
			sum= sum + score;
		}
		
		System.out.println(company + "의 " + name +"의 총점은 " + sum + "점이고,");
		System.out.println("평균은" + sum/3 + "점 입니다.");
	}

}
