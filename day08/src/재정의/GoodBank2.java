package 재정의;

public class GoodBank2 extends Bank2 {
	@Override
	public void getInterestRate() {
		System.out.println("3.0% 의 이자율을 받다.");
	}
	
}
