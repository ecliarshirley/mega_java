package 파일입출력;

import java.util.Vector;

public class 컬랙션테스트 {

	public static void main(String[] args) {
		Vector list = new Vector();
		list.add("나는 스트링");
		list.add(100);
		list.add(11.22);
		list.add(true);
		
		System.out.println(list.size());
		list.remove(3);
		System.out.println(list.size());
		
		for (Object o : list) {
			System.out.println(o);
		}
	}

}
