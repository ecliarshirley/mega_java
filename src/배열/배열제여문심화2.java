package 배열;

public class 배열제여문심화2 {

	public static void main(String[] args) {
//		int[] seat1 = new int[10];
		// 배열은 자동초기화 . 0 이 있음
//		for (int i = 0; i < seat1.length; i++) {
//			System.out.println(seat1[i] + " ");
//		}

		System.out.println("-------------");

		int[][] seat2 = new int[5][10];

		seat2[1][9] = 1;
		seat2[1][8] = 1;
		seat2[1][7] = 1;

		//행의 개수
		System.out.println(seat2.length);

		
		//행마다 열의 개수가 다르다
		System.out.println(seat2[0].length);
		System.out.println(seat2[1].length);
		
		for (int i = 0; i < seat2.length; i++) {
			for (int j = 0; j < seat2[i].length; j++) {
				System.out.print(seat2[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
