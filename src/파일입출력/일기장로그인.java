package 파일입출력;

import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 일기장로그인 {
	public 일기장로그인() {
		JFrame f = new JFrame("일기장");
		f.setSize(650, 900);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel img = new JLabel();
		ImageIcon icon = new ImageIcon("d.jpg");
		img.setIcon(icon);
		f.getContentPane().add(img);
		
		JLabel l1 = new JLabel("id 입력");
		f.getContentPane().add(l1);
		
		TextField t1 = new TextField(10);
		f.getContentPane().add(t1);
		
		JLabel l2 = new JLabel("pw 입력");
		f.getContentPane().add(l2);
		TextField t2 = new TextField(10);
		f.getContentPane().add(t2);
		
		JButton b = new JButton("로그인 처리");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//버튼을 눌렀을 때 입력 값 가지고 오는
				String s1 = t1.getText();  //id
				String s2 = t2.getText();  //pw
				
				System.out.println("입력id :" + s1);
				System.out.println("입력pw :" + s2);
				
				String id = "root";
				String pw = "1234";
				
				if (id.equals(s1) && pw.equals(s2)) {
					System.out.println("로그인 ok");
					일기장 diary = new 일기장();
										
				} else {
					System.out.println("로그인 error");
					JOptionPane.showMessageDialog(null, "다시 로그인 해 주세요");
					t1.setText("");
					t2.setText("");
					
				}
				
				
				
				
			}
		});
		f.getContentPane().add(b);
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		일기장로그인 name = new 일기장로그인();
		//이렇게 하면 일기장 로그인 메소드가 자동 호출 됨.
		//main 위에 static 안 해도 되서 용량이 적어짐
		
		
		
	}

}
