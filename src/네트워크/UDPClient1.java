package ��Ʈ��ũ;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPClient1 { //Ŭ���̾�Ʈ�� �ޱ⸸.
	//Ŭ���̾�Ʈ ���� �غ� �Ǿ�� (�޴� �� ���� ����)

	public static void main(String[] args) {
		try {
			DatagramSocket socket = new DatagramSocket(5000);
			System.out.println("�����κ��� ���� ���� �غ� ��1.....");
			
			byte[] data = new byte[256];
			
			DatagramPacket packet = new DatagramPacket(data, data.length);
			//���� �� ��Ű���ϱ� �ּ� ���� �ʾƵ� ��.
			
			socket.receive(packet); //receive�� �ѹ� �ް� ������.
//			String data2 = new String(data);   //�Ʒ� new String(data)�κа� ����.���� �ϳ��� ����
			System.out.println("������ ���� �����ʹ� " + new String(data));
			System.out.println("������ ���� ������ ���� �Ϸ�!");
			
		} catch (Exception e) {
		} 
		
		
		
	}

}
