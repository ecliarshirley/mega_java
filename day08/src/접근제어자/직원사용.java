package 접근제어자;

public class 직원사용 {
	public static void main(String[] args) {
		직원 e = new 직원();
//		e.rrn = 12; //private라 접근 불가
		e.address = "강남";
		e.name = "홍";
		e.salary = 100;
		
	}
}
