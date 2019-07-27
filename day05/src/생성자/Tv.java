package 생성자;

public class Tv {

		//정적인 특징 => 멤버변수
		int ch;
		int vol;
		boolean onOff;
//		
		//생성자.
		//객체생성시 자동으로 호출
		public Tv(){
			System.out.println("객체 생성시 내가 자동 호출되어요");
		}
		
		public Tv(int c, int v, boolean o) {
			ch = c;
			vol = v;
			onOff = o;
		}
		
		
		//동적인 특징 => 멤버메소드
		public void powerOn() {
			System.out.println("TV를 켜다.");
		}
		
		public void powerOff() {
			System.out.println("TV를 끄다.");
		}
		
		@Override   // (재정의) //주소값이 아닌 원하는 값으로 나오게
		public String toString() {
			return ch + ", " + vol + ", " + onOff;
		}



}

