package 조건문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class 그래픽이미지넣기 {

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
				System.out.println("가위 눌렀어요");
				Random r = new Random();
				
				int computer = r.nextInt(3);
				// 0 - 가위 1 - 보자기 2 - 주먹
				if (computer == 0) {
					btm.setText("비겼어요");
				} else if(computer == 1) {
					btm.setText("이겼네요!");
				} else {
					btm.setText("안타갑게 컴퓨터가 이겼어요");
				}
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\shirley\\day02\\\uAC00\uC704.jpg"));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("보자기를 눌렀어요");
				Random r = new Random();
				
				int computer = r.nextInt(3);
				// 0 - 가위 1 - 보자기 2 - 주먹
				if (computer == 0) {
					btm.setText("안타갑게 컴퓨터가 이겼어요");
				} else if(computer == 1) {
					btm.setText("비겼어요!");
				} else {
					btm.setText("이겼어요");
				}
				
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("D:\\shirley\\day02\\\uBC14\uC7042.jpg"));
		f.getContentPane().add(btnNewButton_1, BorderLayout.CENTER);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("주먹을 눌렀어요");
				Random r = new Random();
				
				int computer = r.nextInt(3);
				// 0 - 가위 1 - 보자기 2 - 주먹
				if (computer == 0) {
					btm.setText("이겼어요");
				} else if(computer == 1) {
					btm.setText("안타갑게 컴퓨터가 이겼어요!");
				} else {
					btm.setText("비겼네요");
				}
				
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("D:\\shirley\\day02\\\uC8FC\uBA39.jpg"));
		f.getContentPane().add(btnNewButton_2, BorderLayout.EAST);
		
		
		
		f.setVisible(true);
		
		
		
	}

}
