package ����ƽ;

public class Car {
	int speed;			//�� ���鶧 ���� ���ε���
	static int count; 	//����
	
	
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
