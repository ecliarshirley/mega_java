package ����ó��;

public class ����ó���׽�Ʈ2 {

	public static void main(String[] args) {
		
		try {
			//������ �߻��� �� ���� �ڵ� �ִ´�.
			int[] num = {1,2};
			num[2] = 3; //���� �߻�
			
		} catch (Exception e) {
			//���� ó�� ���� �ڵ� �ִ´�.
			e.printStackTrace();
			System.out.println("�����߻�!");
		}
		System.out.println("���� ���� �� ���?");
		
	}

}
