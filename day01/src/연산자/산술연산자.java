package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {
		int n1 = 200;
		int n2 = 100;
		
		System.out.println((n1==n2) );
		System.out.println(n1 != n2);
		System.out.println(n1 > n2);
		System.out.println(n1 < n2);
		System.out.println(n1 <= n2);
		
		//ctrl + alt + 화살표 아래: 복사
		//alt +화살표 :이동
		
		System.out.println("합" + (n1 + n2));
		System.out.println("빼기" + (n1 - n2));
		System.out.println("곱하기" + n1 * n2);
		System.out.println("나누기" + n1 / n2);
		System.out.println("나눠지는지" + n1 % n2);
		
	}

}
