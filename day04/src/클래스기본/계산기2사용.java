package Ŭ�����⺻;

public class ����2��� {

	public static void main(String[] args) {
		����2 cal = new ����2();
		//5��, 5000��/1�� => 25,000��.
		//2���� �̻��̸� ����.
		
		int total = cal.mul(5, 5000);  //����2�� mul��갡�����
		if (total > 20000) { 
			System.out.println("����� ���� �ݾ���: " + (total-2000));
		} else {
			System.out.println("����� ���� �ݾ���: " + (total));
			
		}
		
	}

}
