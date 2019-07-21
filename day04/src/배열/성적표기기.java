package 배열;

import java.util.Scanner;

public class 성적표기기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] student = null;  //array를 선언

		while (true) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 |5.종료");
			System.out.println("---------------------------------------------------");
			System.out.print("선택> ");
			int opt = sc.nextInt();

			if (opt == 1) {
				System.out.print("학생수 >");
				int no = sc.nextInt();
				student = new int[no];   //박스array를 넣는다

			} else if (opt == 2) {
				for (int i = 0; i < student.length; i++) {
					System.out.print("student점수[" + i + "] >");
					student[i] = sc.nextInt();   //student[0]에 점수 기입~
				}  

			} else if (opt == 3) {
				//array 순서대로 출력
				for (int i = 0; i < student.length; i++) {
					System.out.println("student[" + i +"] >" + student[i]);
				}

			} else if (opt == 4) {
				int max = student[0];  //여기 안에서 선언
				for (int i = 0; i < student.length; i++) {
					if(student[i] > max)
						max = student[i];
				}
				System.out.println("최고 점수: " + max);
				
				int sum = 0;
				for (int i = 0; i < student.length; i++) {
					sum = sum + student[i];
				}
				System.out.println( "평균:" + sum/student.length);
				
				
			} else if (opt == 5) {
				System.out.println("프로그램을 종료합니다");
				break;
			}

		}

	}

}
