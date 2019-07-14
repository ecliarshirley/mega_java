package 순차문;

import java.util.Random;

public class 로또번호발행기 {

	public static void main(String[] args) {
		Random r = new Random();
		
		System.out.println(r.nextInt(3));
		System.out.println(r.nextInt(3));
		System.out.println(r.nextInt(3));
		
	}

}
