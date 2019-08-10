package 연산자;

public class 증감연산자3 {

	public static void main(String[] args) {

//		int x = 3;
//		int y = 5;
//		int z = ++x + y++;
//		
//		System.out.println(x); //3
//		System.out.println(y); //5+1
//		System.out.println(z); // 4+5
		
		
		int x = 3;
		int y = 5;
		int z = x-- + --y;
		
		System.out.println(x); // 2
		System.out.println(y); // 4
		System.out.println(z); // 3 + 4
		
		
	
	}
}
