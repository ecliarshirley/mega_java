package 배열;

public class ForEachTest {

	public static void main(String[] args) {
		int[] num = {10, 20, 30, 40, 50};
		System.out.println("첫번째 num: " + num[0]);
		System.out.println("배열의 개수: " + num.length);
		System.out.println("맨 마지막 num:" + num[num.length-1]);
		//배열 전체 다 나오게 
		//i 는 위치값 index의 i임
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		System.out.println("---------------");
		//for each 임
		//integer 의 i 가 기본이라, x로 바꿈
		for (int x : num) {
			System.out.println(x);
		}
		
		String[] names = {"홍길동", "김길동", "박길동"};
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	
		for (String s : names) {
			System.out.println(s);
		}
		
	}

}
