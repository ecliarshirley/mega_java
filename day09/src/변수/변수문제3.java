package ����;

public class ��������3 {

	public static void main(String[] args) {

		int num = 10;
		
		try {
			System.out.println(num/0);
		} catch (Exception e) {
			//������ �߻��� ������ ó��
			System.out.println("���� �߻��ߴµ� ó����.");
		} finally {
			//�����߻� ������ ������� ������ �����ϰ��� �ϴ� ���
			System.out.println("������ ���� ����.");
			//���ϰ��� ������ ������ close! �� ��� �ϴ� ��쿡 ���� (FileWriter)
			
			//��Ʈ��ũ ������ ����� �ϴ� ���!
			
		}
		
	}

}
