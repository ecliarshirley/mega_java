package 파일입출력;

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

public class 일기장 {

	public 일기장() {
		JFrame f = new JFrame("나의 일기장");
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		f.setSize(500, 800);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel img = new JLabel();
		ImageIcon icon = new ImageIcon("i.jpg");
		img.setIcon(icon);
		f.getContentPane().add(img);
		
		JLabel l1 = new JLabel("날짜:");
		l1.setFont(new Font("굴림", Font.PLAIN, 20));
		f.getContentPane().add(l1);
		TextField t1 = new TextField(30);
		t1.setFont(new Font("Dialog", Font.PLAIN, 22));
		f.getContentPane().add(t1);
		
		JLabel l2 = new JLabel("제목:");
		l2.setFont(new Font("굴림", Font.PLAIN, 20));
		f.getContentPane().add(l2);
		TextField t2 = new TextField(30);
		t2.setFont(new Font("Dialog", Font.PLAIN, 22));
		f.getContentPane().add(t2);
		
		
		JLabel l3 = new JLabel("내용:");
		l3.setFont(new Font("굴림", Font.PLAIN, 20));
		f.getContentPane().add(l3);
//		TextField t3 = new TextField(38);
		JTextArea t3 = new JTextArea(7,20);
		t3.setFont(new Font("Dialog", Font.PLAIN, 22));
		f.getContentPane().add(t3);
		
		
		
		
		JButton b1 = new JButton("파일에 저장");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//1. 날짜를 가져다가 파일 이름을 만들어야 한다.
				
				String date = t1.getText();
				try {
					FileWriter file = new FileWriter(date + ".txt");
					//2. 파일에 날짜, 제목, 내용을 저장
					String s2 = t2.getText();
					String s3 = t3.getText();
					
					file.write(date + "\n");
					file.write(s2 + "\n");
					file.write(s3 + "\n");
					
					//3. 파일 스트림을 닫아야
					JOptionPane.showMessageDialog(null, "파일 저장 성공!");
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
