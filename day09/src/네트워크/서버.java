package ��Ʈ��ũ;

import java.net.ServerSocket;
import java.net.Socket;

public class ���� {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(2401);
		System.out.println("������ ���� ��");
		System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��� ��.......");
		
		int count = 0;//�������� �̱� ������ ���� �ʱ�ȭ ���Ѿ�
		
		Socket socket = null;
		
		while (true) {
			socket = server.accept(); //����!
			count++;
			System.out.println("Ŭ���̾�Ʈ���� ���� ����! " + count + "�� ������.");
		}
	}
}
