package 파일입출력;

import java.util.HashSet;

public class 컬랙션테스트3 {

	public static void main(String[] args) {
		HashSet bag = new HashSet();
		bag.add("휴지");
		bag.add("볼펜");
		bag.add("핸드폰");
		
		System.out.println(bag);
		bag.add("볼펜");
		System.out.println(bag);
		
	}

}
