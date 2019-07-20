package 반복문;

import java.util.Random;

public class ForTest2 {

	public static void main(String[] args) {
		
		Random r = new Random();
		for (int i = 0; i < 6; i++) {
			//랜덤함 값 발생
			int result = r.nextInt(45);
			System.out.println(result);
		}
	}

}
