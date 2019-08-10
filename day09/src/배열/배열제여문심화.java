package 배열;

public class 배열제여문심화 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) { // 줄
			for (int j = 0; j < 10; j++) { // 한줄체크 
				System.out.print("★");
			}
			System.out.println();
		}
		
		
		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 10; i++) {
				System.out.print(i +" ");
			} 
			System.out.println();
		}
		
	}

}
