package 네트워크;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class 클라이언트 {

	public static void main(String[] args)  {
		Socket socket = null; //참조형 (지역변수니까 null)
		try {
			socket = new Socket("localhost", 2401);
			System.out.println("서버와의 접속 성공1.");
		} catch (Exception e) {
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
			}
		}
	}

}
