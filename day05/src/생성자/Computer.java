package »ý¼ºÀÚ;

public class Computer {

	String Company;
	int Price;
	
	public Computer(String c, int p) {
		Company = c;
		Price = p;
	}
	
	@Override
	public String toString() {
		return Company + ", " + Price;
	}
	
}
