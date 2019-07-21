package 클래스기본;

public class 계산기2사용 {

	public static void main(String[] args) {
		계산기2 cal = new 계산기2();
		//5명, 5000원/1잔 => 25,000원.
		//2만원 이상이면 할인.
		
		int total = cal.mul(5, 5000);  //계산기2의 mul계산가지고옴
		if (total > 20000) { 
			System.out.println("당신의 지불 금액은: " + (total-2000));
		} else {
			System.out.println("당신의 지불 금액은: " + (total));
			
		}
		
	}

}
