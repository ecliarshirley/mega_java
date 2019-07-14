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
		
		JButton btnNewButton = new JButton("\uBC14\uC704");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("바위를 누르셨군요");
				Random r = new Random();
				//0 = 가위 , 1 = 바위, 2 = 보
				int computer = r.nextInt(3);
				if (computer ==0) { //가위
					System.out.println("이겼네요");
				} else if(computer ==1 ) { //바위
					System.out.println("비겼네요");
				} else {
					System.out.println("컴퓨터 승");
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\tjsc2-202-01\\Desktop\\\uBC14\uC7042.jpg"));
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("\uAC00\uC704");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\tjsc2-202-01\\Desktop\\\uAC00\uC704.jpg"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("가위를 누르셨네요");
				Random r = new Random();
				int computer = r.nextInt(3);
				//0 - 가위  / 1- 바위 / 2 - 보 
				if (computer==0) {
					System.out.println("비겼네요");
				} else if (computer==1){
					System.out.println("컴퓨터가 이겼네요");
				}
				else {
					System.out.println("이겼네요");
				}
				
				
			}
		});
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("\uBCF4");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("보자기 를 누르셨네요");
				Random r = new Random();
				int computer = r.nextInt(2);
				
				if (computer ==0) {
					System.out.println("이겼네요");
					
				} else if(computer ==1){
					System.out.println("컴퓨터가 이겼어요");
				} else {
					System.out.println("비겼어요");
				}
				
				
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\tjsc2-202-01\\Desktop\\\uC8FC\uBA39.jpg"));
		f.getContentPane().add(btnNewButton_2, BorderLayout.EAST);
		
		
		f.setVisible(true);
		
		
		
	}

}
