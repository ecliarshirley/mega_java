package 생성자;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 중국집메뉴판복습 {
	static int count = 0;
	static int sum = 0;  //총 결제 금액
	static int j = 0; //짜장면 선택 수
	static int z = 0; //짬뽕
	static int w = 0; //우동

	public static void main(String[] args) {

		JFrame f = new JFrame("중국집 메뉴판");
		f.setSize(400, 600);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		
		JButton img = new JButton();
		ImageIcon icon = new ImageIcon("f0.jpg");
		img.setIcon(icon);
		f.getContentPane().add(img);
		
		JTextField t1 = new JTextField(15);
		JTextField t2 = new JTextField(15);
		f.getContentPane().add(t1);
		t1.setText(count + "개");
		f.getContentPane().add(t2);
		
		JLabel result2 = new JLabel("결과 디스플레이");
		
		JButton b1 = new JButton("짜장면");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("f1.jpg");
				img.setIcon(icon);
				f.getContentPane().add(img);
				count++;
				t1.setText(count + "개");
				j++;
			}
		});
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("짬뽕");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("f2.jpg");
				img.setIcon(icon);
				f.getContentPane().add(img);
				count++;
				t1.setText(count + "개");
				z++;
			}
		});
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("우동");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("f3.jpg");
				img.setIcon(icon);
				f.getContentPane().add(img);
				count++;
				t1.setText(count + "개");
				w++;
			}
		});
		f.getContentPane().add(b3);
		
		
		
		JButton result = new JButton("결과값 불러오기");
		result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum = count * 5000;
				t2.setText(sum + "원");
				
				result2.setText("짜장면" + j + "짬뽕" + z + "우동" + w);
			}
		});
		f.getContentPane().add(result);
		
		JButton zero = new JButton("선택 초기화");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("0");
				t2.setText("0");
			}
		});
		
		f.getContentPane().add(result2);
		f.getContentPane().add(zero);
		
		
		
		
		
		f.setVisible(true);	
		
	}

}
