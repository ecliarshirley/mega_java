package »ý¼ºÀÚ;

public class CoffeeUser {

	public static void main(String[] args) {
		Coffee c1 = new Coffee();
		Coffee c2 = new Coffee(1000);
		Coffee c3 = new Coffee(1000, "¶ó¶¼");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
