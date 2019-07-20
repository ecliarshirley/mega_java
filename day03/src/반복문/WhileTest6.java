package 반복문;

import java.util.Scanner;

public class WhileTest6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int target = 50;
		//ctrl + shift + f : 코드 정리
		while (true) {
			System.out.println("생각한 숫자를 입력하세요: ");
			int data = sc.nextInt();
			if(data == target) {
				System.out.println("축하합니다. 정답입니다.");
				break; //반복문 종료
			}
			else {
				System.out.println("정답이 아닙니다. 다시 입력");
			}
			
		}
		
	}

}
