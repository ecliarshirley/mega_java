package ������;

import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

class ���Ǳ׷��� {

	public ���Ǳ׷���() {
		JFrame f = new JFrame("���� �׷���");
		f.setSize(700, 500);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		ImageIcon icon2 = new ImageIcon("001.jpg");
		JButton b1 = new JButton();
		b1.setIcon(icon2);
		
		//add�� f�� �÷��ش�.
		f.add(b1);
		
		JButton b2 = new JButton("���� ��ư");
		f.add(b2);
		
		JButton b3 = new JButton("��ư3");
		f.add(b3);
		
		ImageIcon icon = new ImageIcon("005.png");

		JButton b4 = new JButton(icon);
		f.add(b4);
		
		
		
		
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {

		���Ǳ׷��� me = new ���Ǳ׷���();
		
		
	}

}
