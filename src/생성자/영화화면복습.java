package ������;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ��ȭȭ�麹�� {

	public ��ȭȭ�麹��() {
	
		JFrame f = new JFrame("���ǿ�ȭȭ��");
		f.setSize(350, 500);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JButton image = new JButton();
		ImageIcon icon = new ImageIcon("m1.png");
		image.setIcon(icon);
		f.getContentPane().add(image);
		
		
		JButton b1 = new JButton("�");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("m1.png");
				image.setIcon(icon);
			}
		});
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("��");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("m2.png");
				image.setIcon(icon);
				
			}
		});
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("ĸƾ����");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("m3.png");
				image.setIcon(icon);
			}
		});
		f.getContentPane().add(b3);
		
		
		
		
		f.setVisible(true);
	}
		
	public static void main(String[] args) {
		��ȭȭ�麹�� name = new ��ȭȭ�麹��();
	}

}
