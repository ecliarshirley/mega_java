package ����ó��;

public class ����ó���׽�Ʈ3 {
//javac(������ ���α׷�)
//java (���� ���α׷�)
	public static void main(String[] args) {
		try {
			System.out.println(4/0);
			
		} catch (Exception e) {
			//���� ó��
			System.out.println("������ �߻���!");
			e.printStackTrace();
			
		}
		System.out.println("���� ó�� �Ϸ�");
		
	}

}
