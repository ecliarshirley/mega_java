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
		
		JButton btm = new JButton("\uACB0\uACFC\uAC12\uC774 \uC5EC\uAE30 \uD45C\uAE30\uB429\uB2C8\uB2E4");
		f.getContentPane().add(btm, BorderLayout.SOUTH);
		
		
		JButton top = new JButton("\uAC00\uC704\uBC14\uC774\uBCF4 \uAC8C\uC784");
		f.getContentPane().add(top, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("���� �������");
				Random r = new Random();
				
				int computer = r.nextInt(3);
				// 0 - ���� 1 - ���ڱ� 2 - �ָ�
				if (computer == 0) {
					btm.setText("�����");
				} else if(computer == 1) {
					btm.setText("�̰�׿�!");
				} else {
					btm.setText("��Ÿ���� ��ǻ�Ͱ� �̰���");
				}
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\shirley\\day02\\\uAC00\uC704.jpg"));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("���ڱ⸦ �������");
				Random r = new Random();
				
				int computer = r.nextInt(3);
				// 0 - ���� 1 - ���ڱ� 2 - �ָ�
				if (computer == 0) {
					btm.setText("��Ÿ���� ��ǻ�Ͱ� �̰���");
				} else if(computer == 1) {
					btm.setText("�����!");
				} else {
					btm.setText("�̰���");
				}
				
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("D:\\shirley\\day02\\\uBC14\uC7042.jpg"));
		f.getContentPane().add(btnNewButton_1, BorderLayout.CENTER);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("�ָ��� �������");
				Random r = new Random();
				
				int computer = r.nextInt(3);
				// 0 - ���� 1 - ���ڱ� 2 - �ָ�
				if (computer == 0) {
					btm.setText("�̰���");
				} else if(computer == 1) {
					btm.setText("��Ÿ���� ��ǻ�Ͱ� �̰���!");
				} else {
					btm.setText("���׿�");
				}
				
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("D:\\shirley\\day02\\\uC8FC\uBA39.jpg"));
		f.getContentPane().add(btnNewButton_2, BorderLayout.EAST);
		
		
		
		f.setVisible(true);
		
		
		
	}

}
