package ���������;

import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class �ϱ��� {

	public �ϱ���() {
		JFrame f = new JFrame("���� �ϱ���");
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		f.setSize(500, 800);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel img = new JLabel();
		ImageIcon icon = new ImageIcon("i.jpg");
		img.setIcon(icon);
		f.getContentPane().add(img);
		
		JLabel l1 = new JLabel("��¥:");
		l1.setFont(new Font("����", Font.PLAIN, 20));
		f.getContentPane().add(l1);
		TextField t1 = new TextField(30);
		t1.setFont(new Font("Dialog", Font.PLAIN, 22));
		f.getContentPane().add(t1);
		
		JLabel l2 = new JLabel("����:");
		l2.setFont(new Font("����", Font.PLAIN, 20));
		f.getContentPane().add(l2);
		TextField t2 = new TextField(30);
		t2.setFont(new Font("Dialog", Font.PLAIN, 22));
		f.getContentPane().add(t2);
		
		
		JLabel l3 = new JLabel("����:");
		l3.setFont(new Font("����", Font.PLAIN, 20));
		f.getContentPane().add(l3);
//		TextField t3 = new TextField(38);
		JTextArea t3 = new JTextArea(7,20);
		t3.setFont(new Font("Dialog", Font.PLAIN, 22));
		f.getContentPane().add(t3);
		
		
		
		
		JButton b1 = new JButton("���Ͽ� ����");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//1. ��¥�� �����ٰ� ���� �̸��� ������ �Ѵ�.
				
				String date = t1.getText();
				try {
					FileWriter file = new FileWriter(date + ".txt");
					//2. ���Ͽ� ��¥, ����, ������ ����
					String s2 = t2.getText();
					String s3 = t3.getText();
					
					file.write(date + "\n");
					file.write(s2 + "\n");
					file.write(s3 + "\n");
					
					//3. ���� ��Ʈ���� �ݾƾ�
					JOptionPane.showMessageDialog(null, "���� ���� ����!");
					file.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				
			}
		});
		f.getContentPane().add(b1);
		
		
		f.setVisible(true);
	}
	
//	public static void main(String[] args) {
//		
//	}

}
