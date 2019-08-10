package 연산자;

public class 증감연산자2 {

	public static void main(String[] args) {
		int sum = 0;
		int n = 10;
		
		sum = n++;
		System.out.println(sum); 	//10
		System.out.println(n);  	//11
		
		sum = ++n; //11
		System.out.println(sum); 	//12
		System.out.println(n);		//12
	}
}
