package �迭;

public class �迭��������ȭ2 {

	public static void main(String[] args) {
//		int[] seat1 = new int[10];
		// �迭�� �ڵ��ʱ�ȭ . 0 �� ����
//		for (int i = 0; i < seat1.length; i++) {
//			System.out.println(seat1[i] + " ");
//		}

		System.out.println("-------------");

		int[][] seat2 = new int[5][10];

		seat2[1][9] = 1;
		seat2[1][8] = 1;
		seat2[1][7] = 1;

		//���� ����
		System.out.println(seat2.length);

		
		//�ึ�� ���� ������ �ٸ���
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
