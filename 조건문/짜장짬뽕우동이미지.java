package ���ǹ�;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class ¥��«�Ϳ쵿�̹��� {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(900, 500);
		f.setTitle("���ļ���");
		
		JButton btm = new JButton("�޴��� �����Ͻø� �ݾ��� �߰� �˴ϴ�.");
		btm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		f.getContentPane().add(btm, BorderLayout.SOUTH);
		
		
		JButton btnNewButton = new JButton("\uBA54\uB274\uD310 \uC785\uB2C8\uB2E4");
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JButton bzz = new JButton("");
		bzz.setIcon(new ImageIcon("C:\\Users\\tjsc2-202-01\\Desktop\\\uC9DC\uC7A5\uBA74.JPG"));
		bzz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("¥��� ������ ����!");
				btm.setText("¥��� �ݾ��� 5000�� �Դϴ�.");
				
			}
		});
		f.getContentPane().add(bzz, BorderLayout.WEST);
		
		JButton bzb = new JButton("");
		bzb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("«�� ������ ����!");
				btm.setText("«�� �ݾ��� 7000�� �Դϴ�.");
			}
		});
		bzb.setIcon(new ImageIcon("D:\\shirley_can_del\\\uC9EC\uBF55.JPG"));
		f.getContentPane().add(bzb, BorderLayout.CENTER);
		
		JButton bud = new JButton("");
		bud.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("�쵿 ������ ����!");
				btm.setText("�쵿 �ݾ��� 8000�� �Դϴ�.");
			}
		});
		bud.setIcon(new ImageIcon("D:\\shirley_can_del\\\uC6B0\uB3D9.JPG"));
		f.getContentPane().add(bud, BorderLayout.EAST);
		
		
		
		f.setVisible(true);
		
	}

}
