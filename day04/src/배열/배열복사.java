package �迭;

import java.util.Arrays;

public class �迭���� {

	public static void main(String[] args) {

		//���� ����
		int n1 = 100;
		int n2 = n1;
		System.out.println(n1);
		System.out.println(n2);

		n1 = 200;
		System.out.println(n1);
		System.out.println(n2);
		
		//�迭�� ���� . 
		//���� ����
		// �ּҰ��� ����. ������ ������ ����Ű��, ���ڸ� ���簡 �ƴ�
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
		
		//���� ����
		System.out.println("---------------------------");
		
		int[] n5 = {1,2};
		int[] n6 = n5.clone(); //�� ���� �� ����Ǵ� ���� ����.
		
		n5[0] = 99;
		
		for (int x : n5) {
			System.out.println(x);
		}
		for (int x : n6) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------");
		
		//�迭����
		int[] n7 = {77,66,55,45,37};
		Arrays.sort(n7);  //class import���� �״�� ���°Ŷ� �빮�ڷ� ����.
		for (int x : n7) {
			System.out.println(x);
		}
		
	}

}
