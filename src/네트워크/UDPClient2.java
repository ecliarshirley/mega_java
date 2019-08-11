package 네트워크;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPClient2 { //클라이언트는 받기만.
	//클라이언트 부터 준비 되어야 (받는 쪽 부터 실행)

	public static void main(String[] args) {
		try {
			DatagramSocket socket = new DatagramSocket(6000);
			System.out.println("서버로부터 전송 수진 준비 끝2.....");
			
			byte[] data = new byte[256];
			
			DatagramPacket packet = new DatagramPacket(data, data.length);
			//받을 빈 패키지니까 주소 적지 않아도 됨.
			
			socket.receive(packet); //receive는 한번 받고 끝난다.
//			String data2 = new String(data);   //아래 new String(data)부분과 같음.둘중 하나만 가능
			System.out.println("서버로 받은 데이터는 " + new String(data));
			System.out.println("서버로 부터 데이터 수신 완료!");
			
		} catch (Exception e) {
		} 
		
		
		
	}

}
