package ��Ʈ��ũ;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPClient2 { //Ŭ���̾�Ʈ�� �ޱ⸸.
	//Ŭ���̾�Ʈ ���� �غ� �Ǿ�� (�޴� �� ���� ����)

	public static void main(String[] args) {
		try {
			DatagramSocket socket = new DatagramSocket(6000);
			System.out.println("�����κ��� ���� ���� �غ� ��2.....");
			
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
