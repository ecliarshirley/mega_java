package �迭;

public class Seat {

	public static void main(String[] args) {
		int[] seat = new int[10];
		for (int i = 0; i < seat.length; i++) {
			System.out.print(seat[i]+ " ");
		}
		//5,6�� �ڸ� ����ó��
		//0->1�� ����.
		
		seat[5] = 1;
		seat[6] = 1;
		System.out.println("\n--------------------");
		//��� �ڸ� ��Ȳ ����Ʈ
		
		for (int i = 0; i < seat.length; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 0; i < seat.length; i++) {
			System.out.print(seat[i]+ " ");
		}
		
		
		
	}

}
