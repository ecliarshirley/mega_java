package 재정의;

public class BankRates {

	public static void main(String[] args) {
		BadBank b = new BadBank();
		NoramalBank n = new NoramalBank();
		GoodBank g = new GoodBank();
		
		b.이자율();
		System.out.println(b);
		n.이자율();
		System.out.println(n);
		g.이자율();
		System.out.println(g);
		
		
		
	}

}
