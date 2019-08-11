package 네트워크;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class 채팅A extends JFrame{
	JTextArea list;
	JTextField input;
	DatagramSocket socket;  //받는 용도로 사용
	InetAddress ip;
	
	public 채팅A() throws Exception {
//		process();
		socket = new DatagramSocket(5000); //받는 쪽(나)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setTitle("채팅A화면");
		list = new JTextArea(15, 20);
		list.setEditable(false);
		input = new JTextField();
		input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //input후 enter치면 작동 됨
				String str = input.getText();
				System.out.println("내가 입력:" + str);
				list.append("혜진: " + str +"\n"); //계속 글을 쌓겠다
				input.setText(""); //엔터 치면 공백으로 지워짐
				
				try {
					DatagramSocket socket = new DatagramSocket();
					byte[] data = str.getBytes();
					ip = InetAddress.getByName("127.0.0.1");
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, 6000);
					socket.send(packet);
					
					
				} catch (Exception e1) {
				}
				
			}
		});
		getContentPane().add(BorderLayout.CENTER,list);
		getContentPane().add(BorderLayout.SOUTH, input);
		
		
		input.setFont(new Font("굴림", Font.BOLD, 30));
		input.setBackground(Color.green);
		input.setForeground(Color.blue);
		list.setFont(new Font("굴림", Font.BOLD, 30));
		list.setBackground(Color.pink);
		pack(); //사이즈를 설정에 맞게 맞춰줌
		
		
		setVisible(true);	
	}
	
	public void process() {
		while (true) {
			byte[] data = new byte [256];
			DatagramPacket packet = new DatagramPacket(data, data.length);
			try {
				socket.receive(packet);
				list.append("너: " + new String(data) + "\n");
				
			} catch (Exception e) {
			}
			
		}
	
	}
	
	
	public static void main(String[] args) throws Exception {
		채팅A name = new 채팅A(); //프로그램 시작 하기 전에
		//받는 부분이 먼저 실행되어 돌아가고 있어야 상대방의 메세지를 받을 수 있음
//		name.process();
	}

}
