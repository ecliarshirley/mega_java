package ������;

public class MyRoom {

	public static void main(String[] args) {
		//new => ��ü���� Tv1, Tv2
		//��ü������ ��������� ���簡 �ȴ�.
		//�� ��������� ���� ���� �־���Ѵ�.
		//������ - ��ü������ ���ÿ� ������� ���� �Ѳ����� ���� �־��ִ�
		//Ư���� �޼ҵ�
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();
		
		//�ּҰ� ���
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
