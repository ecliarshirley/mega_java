package 다른패키지;

import 접근제어자.직원;

public class 직원사용2 {

	public static void main(String[] args) {
		직원	e = new 직원();
		e.name = "홍길";
		//다른 패키지에서는 public으로 설정한 변수만 쓸 수 있다.
	}

}
