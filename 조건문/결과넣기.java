package ���ǹ�;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ����ֱ� {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("���Ǳ׷���");
		f.setSize(600, 600);
		
		JButton btm = new JButton("\uC544\uB798\uBC84\uD2BC");
		btm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		f.getContentPane().add(btm, BorderLayout.SOUTH);
		
		JButton middle = new JButton("\uAC00\uC6B4\uB370\uBC84\uD2BC");
		middle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btm.setText("middle�� �������");
				
			}
		});
		f.getContentPane().add(middle, BorderLayout.CENTER);
		
		JButton top = new JButton("\uC704 \uBC84\uD2BC");
		top.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("top�� �����̱���");
				f.setTitle("top �� ��������");
				btm.setText("top�� �������!");
				
				
			}
		});
		f.getContentPane().add(top, BorderLayout.NORTH);;
		
		f.setVisible(true);
	
	}

}
