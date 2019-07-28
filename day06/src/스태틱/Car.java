package 스태틱;

public class Car {
	int speed;			//차 만들때 마다 따로따로
	static int count; 	//누적
	
	
	public static void printCount() {
		System.out.println(count);
	}
	public Car(int speed) {
		count++;
		this.speed = speed;
	}
	
	public void speedUp() {
		System.out.println("speed up!");
	}
	
}
