package ��Ʈ��ũ;

import java.net.Socket;

public class Ŭ���̾�Ʈ2 {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 2401);
		System.out.println("�������� ���� ����2.");
		socket.close();
	}

}
