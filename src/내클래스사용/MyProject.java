package 내클래스사용;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import inter.신호등2;
import 네트워크.채팅A;
import 네트워크.채팅B;
import 배열.극장200좌석;
import 생성자.나의그래픽2;
import 생성자.중국집메뉴판;
import 스래드.자동차경주게임3;
import 파일입출력.네이버크롤링3;
import 파일입출력.일기장로그인;
import 파일입출력.주식크롤링;

import java.awt.Font;
import java.awt.Color;

public class MyProject extends JFrame{
	public MyProject() {
		setTitle("내 프로젝트 모음");
		setSize(500, 800);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("chatting A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					채팅A a = new 채팅A();
				} catch (Exception e1) {
				}
				
			}
		});
		btnNewButton.setBackground(new Color(250, 128, 114));
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 56));
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("chatting B");
		btnNewButton_1.setBackground(new Color(250, 128, 114));
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 56));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					채팅B b = new 채팅B();
				} catch (Exception e1) {
				}
			}
		});
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uC911\uAD6D\uC2DD\uB2F9\uBA54\uB274");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				중국집메뉴판 menu = new 중국집메뉴판();
			}
		});
		btnNewButton_2.setBackground(new Color(220, 20, 60));
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 56));
		getContentPane().add(btnNewButton_2);
		
		JButton button = new JButton("\uADF9\uC7A5\uC608\uB9E4\uC2DC\uC2A4\uD15C");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				극장200좌석 movie = new 극장200좌석();
			}
		});
		button.setBackground(new Color(65, 105, 225));
		button.setFont(new Font("굴림", Font.PLAIN, 56));
		getContentPane().add(button);
		
		JButton btnNewButton_3 = new JButton("\uC8FC\uC2DD\uD06C\uB864\uB9C1");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				주식크롤링 name = new 주식크롤링();
			}
		});
		btnNewButton_3.setBackground(new Color(0, 139, 139));
		btnNewButton_3.setFont(new Font("굴림", Font.PLAIN, 56));
		getContentPane().add(btnNewButton_3);
		
		JButton button_1 = new JButton("\uC790\uB3D9\uCC28\uACBD\uC8FC\uAC8C\uC784");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				자동차경주게임3 name = new 자동차경주게임3();
			}
		});
		button_1.setFont(new Font("굴림", Font.PLAIN, 63));
		button_1.setBackground(new Color(30, 144, 255));
		getContentPane().add(button_1);
		
		JButton btnNewButton_4 = new JButton("\uC77C\uAE30\uC7A5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				일기장로그인 name = new 일기장로그인();
			}
		});
		btnNewButton_4.setBackground(new Color(153, 50, 204));
		btnNewButton_4.setFont(new Font("굴림", Font.PLAIN, 56));
		getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("\uC774\uBBF8\uC9C0\uBCC0\uD658");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				나의그래픽2 name = new 나의그래픽2();
			}
		});
		btnNewButton_5.setBackground(new Color(72, 209, 204));
		btnNewButton_5.setFont(new Font("굴림", Font.PLAIN, 56));
		getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("\uC2E0\uD638\uB4F1");
		btnNewButton_6.setBackground(new Color(105, 105, 105));
		btnNewButton_6.setFont(new Font("굴림", Font.PLAIN, 56));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				신호등2 sign = new 신호등2();
			}
		});
		getContentPane().add(btnNewButton_6);
		
		
		
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		MyProject name = new MyProject();
	}

}
