package ����ƽ;

public class CarUser {

	public static void main(String[] args) {
		Car car1 = new Car(100);
		Car car2 = new Car(200);
		
		car1.speedUp(); 
		//�Ϲݸ޼ҵ�� ������ '��ü �̸�.�޼ҵ��̸�'���� ����
		
		System.out.println(Car.count);
		
		Car.printCount();
	}

}
