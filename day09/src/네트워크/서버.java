package 네트워크;

import java.net.ServerSocket;
import java.net.Socket;

public class 서버 {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(2401);
		System.out.println("서버가 시작 됨");
		System.out.println("클라이언트의 접속을 기다리는 중.......");
		
		int count = 0;//지역변수 이기 때문에 내가 초기화 시켜야
		
		Socket socket = null;
		
		while (true) {
			socket = server.accept(); //승인!
			count++;
			System.out.println("클라이언트와의 연결 성공! " + count + "대 연결함.");
		}
	}
}
