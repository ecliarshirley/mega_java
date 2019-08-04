package 스래드;

public class 감소 extends Thread {
	@Override
	public void run() {
		//100부터 1까지 1씩 감소
		for (int i = 100; i > 0; i--) {
			System.out.println("감소: " + i);
		}
	}
	
}
