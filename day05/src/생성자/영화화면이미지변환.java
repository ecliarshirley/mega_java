package ������;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ��ȭȭ���̹�����ȯ {
	
	public ��ȭȭ���̹�����ȯ() {
		JFrame f = new JFrame("���� ��ȭ �ٹ�");
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		f.setSize(320, 480);
		
		JButton img = new JButton();
		ImageIcon icon = new ImageIcon("m1.png");
		img.setIcon(icon);
		f.getContentPane().add(img);
		
		JButton b1 = new JButton("�");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("m1.png");
				img.setIcon(icon);
			}
		});
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("��");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("m2.png");
				img.setIcon(icon);
				
			}
		});
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("ĸƾ����");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("m3.png");
				img.setIcon(icon);
			
			}
		});
		f.getContentPane().add(b3);
		
		f.setVisible(true);
	}

	public static void main(String[] args) {
		��ȭȭ���̹�����ȯ name = new ��ȭȭ���̹�����ȯ();
	}

}
