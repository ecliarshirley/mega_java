package ��Ʈ��ũ;

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

public class ä��A extends JFrame{
	JTextArea list;
	JTextField input;
	DatagramSocket socket;  //�޴� �뵵�� ���
	InetAddress ip;
	
	public ä��A() throws Exception {
//		process();
		socket = new DatagramSocket(5000); //�޴� ��(��)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setTitle("ä��Aȭ��");
		list = new JTextArea(15, 20);
		list.setEditable(false);
		input = new JTextField();
		input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //input�� enterġ�� �۵� ��
				String str = input.getText();
				System.out.println("���� �Է�:" + str);
				list.append("����: " + str +"\n"); //��� ���� �װڴ�
				input.setText(""); //���� ġ�� �������� ������
				
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
		
		
		input.setFont(new Font("����", Font.BOLD, 30));
		input.setBackground(Color.green);
		input.setForeground(Color.blue);
		list.setFont(new Font("����", Font.BOLD, 30));
		list.setBackground(Color.pink);
		pack(); //����� ������ �°� ������
		
		
		setVisible(true);	
	}
	
	public void process() {
		while (true) {
			byte[] data = new byte [256];
			DatagramPacket packet = new DatagramPacket(data, data.length);
			try {
				socket.receive(packet);
				list.append("��: " + new String(data) + "\n");
				
			} catch (Exception e) {
			}
			
		}
	
	}
	
	
	public static void main(String[] args) throws Exception {
		ä��A name = new ä��A(); //���α׷� ���� �ϱ� ����
		//�޴� �κ��� ���� ����Ǿ� ���ư��� �־�� ������ �޼����� ���� �� ����
//		name.process();
	}

}
