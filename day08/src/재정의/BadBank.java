package 재정의;

public class BadBank extends Bank {
	public void 이자율() {
		super.getInterestRate = 10.0;
	}
}
