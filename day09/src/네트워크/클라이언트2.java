package 네트워크;

import java.net.Socket;

public class 클라이언트2 {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 2401);
		System.out.println("서버와의 접속 성공2.");
		socket.close();
	}

}
