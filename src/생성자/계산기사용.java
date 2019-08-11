package 생성자;

public class 계산기사용 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		cal.add();
		cal.add(100, 200);
		cal.add("안녕", "자바");
	}

}
