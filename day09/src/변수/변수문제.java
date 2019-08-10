package 변수;

public class 변수문제 {
	//변수의 생존범위는 선언의 위치에 따라 결정된다.
	//전역변수 (클래스 전체에서 쓸수 있음)
	int num2; 

	public static void main(String[] args) {
		//데이터 저장 공간을 만들고,
		int num;  //지역변수(local) (main 안에서만 쓸 수 있음)
		//데이터타입 변수명; //변수 생성! 선언!
		//선언을 하면 변수가 생성된다.
		
		//i 는 for안에서 만들어 졌기 때문에 지역변수.
		for (int i = 0; i < 3; i++) {
			num = 10;
		}
		//데이터를 집어 넣는다.
	}

}
