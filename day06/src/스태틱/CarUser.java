package 스태틱;

public class CarUser {

	public static void main(String[] args) {
		Car car1 = new Car(100);
		Car car2 = new Car(200);
		
		car1.speedUp(); 
		//일반메소드는 생성된 '객체 이름.메소드이름'으로 접근
		
		System.out.println(Car.count);
		
		Car.printCount();
	}

}
