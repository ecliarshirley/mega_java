package 스래드;

public class 증가 extends Thread {
	@Override
	public void run() {
		//1부터 1씩 증가
		for (int i = 0; i <= 100; i++) {
			System.out.println("증가: " + i);
		}
	}
	
}
