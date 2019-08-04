package 접근제어자;

public class 직원 {
	public String name; //모두 다 
	String address; //같은 패키지 내에서만
	protected int salary; //같은 패지지 + 다른 패키지(상속 만)
	private int rrn; //주민번호 //클래스 밖에서는 접근 불가
	
	
}
