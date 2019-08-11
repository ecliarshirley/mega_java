package 생성자;

public class MyRoom {

	public static void main(String[] args) {
		//new => 객체생성 Tv1, Tv2
		//객체생성시 멤버변수가 복사가 된다.
		//각 멤버변수에 값을 집어 넣어야한다.
		//생성자 - 객체생성과 동시에 멤버변수 값을 한꺼번에 집어 넣어주는
		//특별한 메소드
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();
		
		//주소값 출력
		System.out.println(tv1);
		System.out.println(tv2);
		
//		tv1.ch = 100;
//		tv1.vol = 10;
//		tv1.onOff = true;
		
//		tv2.ch = 220;
//		tv2.vol = 5;
//		tv2.onOff = false;
//		
		tv1.powerOff();
		tv2.powerOn();
		
	}

}
