package ���ǹ�;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class �׷����̹����ֱ� {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(800, 800);
		
		JButton btnNewButton = new JButton("\uBC14\uC704");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("������ �����̱���");
				Random r = new Random();
				//0 = ���� , 1 = ����, 2 = ��
				int computer = r.nextInt(3);
				if (computer ==0) { //����
					System.out.println("�̰�׿�");
				} else if(computer ==1 ) { //����
					System.out.println("���׿�");
				} else {
					System.out.println("��ǻ�� ��");
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\tjsc2-202-01\\Desktop\\\uBC14\uC7042.jpg"));
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("\uAC00\uC704");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\tjsc2-202-01\\Desktop\\\uAC00\uC704.jpg"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("������ �����̳׿�");
				Random r = new Random();
				int computer = r.nextInt(3);
				//0 - ����  / 1- ���� / 2 - �� 
				if (computer==0) {
					System.out.println("���׿�");
				} else if (computer==1){
					System.out.println("��ǻ�Ͱ� �̰�׿�");
				}
				else {
					System.out.println("�̰�׿�");
				}
				
				
			}
		});
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("\uBCF4");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("���ڱ� �� �����̳׿�");
				Random r = new Random();
				int computer = r.nextInt(2);
				
				if (computer ==0) {
					System.out.println("�̰�׿�");
					
				} else if(computer ==1){
					System.out.println("��ǻ�Ͱ� �̰���");
				} else {
					System.out.println("�����");
				}
				
				
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\tjsc2-202-01\\Desktop\\\uC8FC\uBA39.jpg"));
		f.getContentPane().add(btnNewButton_2, BorderLayout.EAST);
		
		
		f.setVisible(true);
		
		
		
	}

}
