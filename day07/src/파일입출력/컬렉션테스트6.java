package 파일입출력;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class 컬렉션테스트6 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//MAP 이 정답임
//		HashMap map = new HashMap();
//		map.put("apple", "사과");
//		map.put("melon", "메론");
//		map.put("book", "책");
		list.add("");
		list.add("엄마");
		list.add("아빠");
		list.add("친구");
		list.add("동생");
		
		System.out.println(list.get(2));
		
		
		ArrayList list2 = new ArrayList();
		list2.add("박소정");
		list2.add("김정민");
		list2.add("소지현");
		list2.add("김개념");
		
		list2.remove(1);
		System.out.println(list2);
		
		HashSet team = new HashSet();
		team.add("프로그래머");
		team.add("DB관리자");
		team.add("프로젝트 매니저");
		team.add("웹디자이너");
		System.out.println(team);
		
		
	}

}
