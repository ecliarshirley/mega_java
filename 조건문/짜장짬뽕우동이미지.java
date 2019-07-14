package 조건문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class 짜장짬뽕우동이미지 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(900, 500);
		f.setTitle("음식선택");
		
		JButton btm = new JButton("메뉴를 선택하시면 금액이 뜨게 됩니다.");
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
				System.out.println("짜장면 먹으러 가요!");
				btm.setText("짜장면 금액은 5000원 입니다.");
				
			}
		});
		f.getContentPane().add(bzz, BorderLayout.WEST);
		
		JButton bzb = new JButton("");
		bzb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("짬뽕 먹으러 가요!");
				btm.setText("짬뽕 금액은 7000원 입니다.");
			}
		});
		bzb.setIcon(new ImageIcon("D:\\shirley_can_del\\\uC9EC\uBF55.JPG"));
		f.getContentPane().add(bzb, BorderLayout.CENTER);
		
		JButton bud = new JButton("");
		bud.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("우동 먹으러 가요!");
				btm.setText("우동 금액은 8000원 입니다.");
			}
		});
		bud.setIcon(new ImageIcon("D:\\shirley_can_del\\\uC6B0\uB3D9.JPG"));
		f.getContentPane().add(bud, BorderLayout.EAST);
		
		
		
		f.setVisible(true);
		
	}

}
