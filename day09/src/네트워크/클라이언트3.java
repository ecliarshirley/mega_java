package ��Ʈ��ũ;

import java.net.Socket;

public class Ŭ���̾�Ʈ3 {

	public static void main(String[] args) throws Exception {
		Socket	socket = new Socket("localhost", 2401);
		System.out.println("�������� ���� ����3.");
		socket.close();
	}

}
