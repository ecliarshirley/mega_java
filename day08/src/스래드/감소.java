package ������;

public class ���� extends Thread {
	@Override
	public void run() {
		//100���� 1���� 1�� ����
		for (int i = 100; i > 0; i--) {
			System.out.println("����: " + i);
		}
	}
	
}
