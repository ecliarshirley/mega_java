package ��Ʈ��ũ;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Ŭ���̾�Ʈ {

	public static void main(String[] args)  {
		Socket socket = null; //������ (���������ϱ� null)
		try {
			socket = new Socket("localhost", 2401);
			System.out.println("�������� ���� ����1.");
		} catch (Exception e) {
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
			}
		}
	}

}
