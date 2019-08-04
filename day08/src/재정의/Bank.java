package 재정의;

public class Bank {
	double getInterestRate;
	
	public void 이자율() {
		getInterestRate = 0;
	}

	@Override
	public String toString() {
		return "Bank [getInterestRate=" + getInterestRate + "]";
	}
	
	
	
}
