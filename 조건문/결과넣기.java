package 조건문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 결과넣기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의그래픽");
		f.setSize(600, 600);
		
		JButton btm = new JButton("\uC544\uB798\uBC84\uD2BC");
		btm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		f.getContentPane().add(btm, BorderLayout.SOUTH);
		
		JButton middle = new JButton("\uAC00\uC6B4\uB370\uBC84\uD2BC");
		middle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btm.setText("middle을 눌렀어요");
				
			}
		});
		f.getContentPane().add(middle, BorderLayout.CENTER);
		
		JButton top = new JButton("\uC704 \uBC84\uD2BC");
		top.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("top을 누르셨군요");
				f.setTitle("top 을 눌렀군요");
				btm.setText("top을 눌럿어용!");
				
				
			}
		});
		f.getContentPane().add(top, BorderLayout.NORTH);;
		
		f.setVisible(true);
	
	}

}
