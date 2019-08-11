package 배열;

import java.util.Scanner;

public class 배열제여문심화3 {

	public static void main(String[] args) {
		int[][] seat2 = new int[10][10];
		Scanner sc = new Scanner(System.in);

			
		
		while (true) {
			System.out.print("   ");
			for (int i = 0; i < seat2.length; i++) {
				System.out.print(i + " ");
			}
			System.out.println("\n-----------------------");
			for (int i = 0; i < seat2.length; i++) {
				System.out.print(i + ": ");
				for (int j = 0; j < seat2[i].length; j++) {
					System.out.print(seat2[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
			System.out.print("행 입력(종료는 -1): ");
			int row = sc.nextInt();
			if(row == -1) {
				System.out.println("예약 종료합니다.");
				break;
			}
			System.out.print("열 입력: ");
			int col = sc.nextInt();
			
			if (seat2[row][col] != 1) {
				seat2[row][col] = 1;
				System.out.println("\n예약이 완료 되었습니다!");
			} else {
				System.out.println("이미 예약된 자리 입니다. 다른 자리를 선택해 주세요.");
			}
			
		}
		
		
		
	}

}
