package 배열;

import java.util.Arrays;

public class 배열복사 {

	public static void main(String[] args) {

		//변수 복사
		int n1 = 100;
		int n2 = n1;
		System.out.println(n1);
		System.out.println(n2);

		n1 = 200;
		System.out.println(n1);
		System.out.println(n2);
		
		//배열의 복사 . 
		//얕은 복사
		// 주소값을 복사. 때문에 원본을 가르키니, 숫자만 복사가 아님
		int[] n3 = {1,2};		
		int[] n4 = n3;
		for (int x : n3) {
			System.out.println(x);
		}
		for (int x : n4) {
			System.out.println(x);
		}
		
		n3[0] = 99;
		for (int x : n3) {
			System.out.println(x);
		}
		for (int x : n4) {
			System.out.println(x);
		}
		
		//깊은 복사
		System.out.println("---------------------------");
		
		int[] n5 = {1,2};
		int[] n6 = n5.clone(); //값 까지 다 복사되는 깊은 복사.
		
		n5[0] = 99;
		
		for (int x : n5) {
			System.out.println(x);
		}
		for (int x : n6) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------");
		
		//배열정렬
		int[] n7 = {77,66,55,45,37};
		Arrays.sort(n7);  //class import원본 그대로 쓰는거라 대문자로 시작.
		for (int x : n7) {
			System.out.println(x);
		}
		
	}

}
