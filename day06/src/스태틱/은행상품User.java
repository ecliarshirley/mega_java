package 스태틱;

public class 은행상품User {

	public static void main(String[] args) {

		은행상품 user1 = new 은행상품("청약저축", "김아무개", 500);
		은행상품 user2 = new 은행상품("내비상금", "김아무개딸", 30);
		은행상품 user3 = new 은행상품("자유적금", "박아무개", 100);
		
		System.out.println("----------------------------------------------");
		System.out.println(user2.product +" 통장에는 " + user2.money +"만원이 들어있어요");
		System.out.println(user3.name +" 통장에는 " + user3.money +"만원이 들어있어요");
		
		int sum = user1.money + user2.money + user3.money;
		
		System.out.println("우리집 전체 예금액은 " + sum + "만원 이에요!");
		
		//static 사용으로 편리화!
		System.out.println("----------------------------------------------");
		//전체 예금액 static 변수 추가
		System.out.println("총 예금액은: " + 은행상품.total);
		
		//전체예금개수 static 변수 추가 출력
		System.out.println("총 가입한 은행 상품개수: " + 은행상품.count);
	}

}
