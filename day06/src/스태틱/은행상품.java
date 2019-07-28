package 스태틱;

public class 은행상품 {
		//class 밑에는 자동으로 초기화 된다. 
		// eg. int money = 0; eg. String product = null;
		String product;
		String name;
		int money;
		static int count;  //계좌수 
		static int total;  //money 누적
		
		public static void printCount() {
			System.out.println(count);
		}
		
		//생성자
		public 은행상품(String product, String name, int money) {
			count++;
			total = total + money;
			this.product = product;
			this.name = name;
			this.money = money;
		}
		
		@Override
		public String toString() {
		return product+ ", " + name +", " + money;
		}
	
}
