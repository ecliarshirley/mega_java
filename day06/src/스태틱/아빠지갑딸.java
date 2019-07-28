package 스태틱;

public class 아빠지갑딸 {

	public static void main(String[] args) {
		
		
		아빠지갑 g1 = new 아빠지갑("홍길동", 100);
		System.out.println("태어난 딸 정보: " + g1);
		System.out.println("딸이 태어난 후 아빠 지갑 잔액: " + 아빠지갑.money);
		
		System.out.println("--------------------");
		아빠지갑 g2 = new 아빠지갑("홍길순", 85);
		System.out.println("태어난 딸 정보: " +g2);
		System.out.println("딸이 태어난 후 아빠 지갑 잔액: " + 아빠지갑.money);
		
		System.out.println("--------------------");
		System.out.println("전체 딸의 수는" + 아빠지갑.count);
		System.out.println("딸이 태어난 후 아빠 지갑 잔액: " + 아빠지갑.money);
	}

}
