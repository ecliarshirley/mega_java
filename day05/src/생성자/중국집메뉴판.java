package 생성자;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 중국집메뉴판 {
	static int count =0;
	static int j = 0;
	static int w = 0;
	static int z = 0;
	static int price = 5000;

	public static void main(String[] args) {
		JFrame f = new JFrame("중국집메뉴판");
		f.setSize(500, 600);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JButton img = new JButton();
		ImageIcon icon = new ImageIcon("f0.jpg");
		img.setIcon(icon);
		f.getContentPane().add(img);
		
		
		JTextField f1 = new JTextField(20);
		JTextField f2 = new JTextField(20);
		JLabel result2 = new JLabel("결과값 출력");
		
		f.getContentPane().add(f1);
		f.getContentPane().add(f2);
		
		
		JButton b1 = new JButton("짜장면");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("f1.jpg");
				img.setIcon(icon);
				count++;
				f1.setText(count+"개");
				j++;
			}
		});
		f.getContentPane().add(b1);
		JButton b2 = new JButton("짬뽕");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("f2.jpg");
				img.setIcon(icon);
				count++;
				f1.setText(count+"개");
				z++;
			}
		});
		f.getContentPane().add(b2);
		JButton b3 = new JButton("우동");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("f3.jpg");
				img.setIcon(icon);
				count++;
				f1.setText(count+"개");
				w++;
			}
		});
		f.getContentPane().add(b3);
		
		
		
		JButton bResult = new JButton("결과값 확인");
		bResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f2.setText((count * price) +"원");
				result2.setText("짜장면: " + j + ", 우동: " + w + ", 짬뽕: " + z);
			}
		});
		f.getContentPane().add(bResult);
		
		
		f.getContentPane().add(result2);
		
		JButton zero = new JButton("선택 초기화");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f1.setText(0+"");
				f2.setText(0+"");
			}
		});
		f.getContentPane().add(zero);
		
		f.setVisible(true);
	}

}
