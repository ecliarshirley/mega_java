package ��Ŭ�������;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import inter.��ȣ��2;
import ��Ʈ��ũ.ä��A;
import ��Ʈ��ũ.ä��B;
import �迭.����200�¼�;
import ������.���Ǳ׷���2;
import ������.�߱����޴���;
import ������.�ڵ������ְ���3;
import ���������.���̹�ũ�Ѹ�3;
import ���������.�ϱ���α���;
import ���������.�ֽ�ũ�Ѹ�;

import java.awt.Font;
import java.awt.Color;

public class MyProject extends JFrame{
	public MyProject() {
		setTitle("�� ������Ʈ ����");
		setSize(500, 800);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("chatting A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ä��A a = new ä��A();
				} catch (Exception e1) {
				}
				
			}
		});
		btnNewButton.setBackground(new Color(250, 128, 114));
		btnNewButton.setFont(new Font("����", Font.PLAIN, 56));
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("chatting B");
		btnNewButton_1.setBackground(new Color(250, 128, 114));
		btnNewButton_1.setFont(new Font("����", Font.PLAIN, 56));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ä��B b = new ä��B();
				} catch (Exception e1) {
				}
			}
		});
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uC911\uAD6D\uC2DD\uB2F9\uBA54\uB274");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				�߱����޴��� menu = new �߱����޴���();
			}
		});
		btnNewButton_2.setBackground(new Color(220, 20, 60));
		btnNewButton_2.setFont(new Font("����", Font.PLAIN, 56));
		getContentPane().add(btnNewButton_2);
		
		JButton button = new JButton("\uADF9\uC7A5\uC608\uB9E4\uC2DC\uC2A4\uD15C");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				����200�¼� movie = new ����200�¼�();
			}
		});
		button.setBackground(new Color(65, 105, 225));
		button.setFont(new Font("����", Font.PLAIN, 56));
		getContentPane().add(button);
		
		JButton btnNewButton_3 = new JButton("\uC8FC\uC2DD\uD06C\uB864\uB9C1");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				�ֽ�ũ�Ѹ� name = new �ֽ�ũ�Ѹ�();
			}
		});
		btnNewButton_3.setBackground(new Color(0, 139, 139));
		btnNewButton_3.setFont(new Font("����", Font.PLAIN, 56));
		getContentPane().add(btnNewButton_3);
		
		JButton button_1 = new JButton("\uC790\uB3D9\uCC28\uACBD\uC8FC\uAC8C\uC784");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				�ڵ������ְ���3 name = new �ڵ������ְ���3();
			}
		});
		button_1.setFont(new Font("����", Font.PLAIN, 63));
		button_1.setBackground(new Color(30, 144, 255));
		getContentPane().add(button_1);
		
		JButton btnNewButton_4 = new JButton("\uC77C\uAE30\uC7A5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				�ϱ���α��� name = new �ϱ���α���();
			}
		});
		btnNewButton_4.setBackground(new Color(153, 50, 204));
		btnNewButton_4.setFont(new Font("����", Font.PLAIN, 56));
		getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("\uC774\uBBF8\uC9C0\uBCC0\uD658");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				���Ǳ׷���2 name = new ���Ǳ׷���2();
			}
		});
		btnNewButton_5.setBackground(new Color(72, 209, 204));
		btnNewButton_5.setFont(new Font("����", Font.PLAIN, 56));
		getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("\uC2E0\uD638\uB4F1");
		btnNewButton_6.setBackground(new Color(105, 105, 105));
		btnNewButton_6.setFont(new Font("����", Font.PLAIN, 56));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				��ȣ��2 sign = new ��ȣ��2();
			}
		});
		getContentPane().add(btnNewButton_6);
		
		
		
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		MyProject name = new MyProject();
	}

}
