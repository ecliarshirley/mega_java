package 파일입출력;

import java.util.ArrayList;

public class 컬랙션테스트2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("박스키");
		list.add("송스키");
		list.add("김스키");
		list.add("정스키");
		
		System.out.println(list);
		list.remove(1);  	//2등 탈락
		System.out.println(list);
		
	}

}
