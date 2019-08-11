package inter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

public class 신호등3 extends JFrame implements ActionListener{
	JButton red, blue, yellow; //전역변수로 뺌. 
	//클래스 내 모든 곳에서 접근 가능
	

	public 신호등3() {
		setTitle("신호등3");
		setSize(500,800);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		red = new JButton("\uBE68\uAC15\uC2E0\uD638");
		red.setForeground(Color.BLACK);
		red.setFont(new Font("굴림", Font.PLAIN, 99));
		red.setBackground(Color.RED);
		getContentPane().add(red);
		
		yellow = new JButton("\uB178\uB791\uC2E0\uD638");
		yellow.setFont(new Font("굴림", Font.PLAIN, 99));
		yellow.setBackground(Color.YELLOW);
		yellow.setForeground(Color.BLACK);
		yellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		getContentPane().add(yellow);
		
		blue = new JButton("\uD30C\uB791\uC2E0\uD638");
		blue.setFont(new Font("굴림", Font.PLAIN, 99));
		blue.setBackground(Color.BLUE);
		blue.setForeground(Color.BLACK);
		blue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		getContentPane().add(blue);
		
		red.addActionListener(this);
		yellow.addActionListener(this);
		blue.addActionListener(this);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		신호등3 name = new 신호등3();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JLabel add = new JLabel();
		
		if (e.getSource() == red) {
			ImageIcon icon = new ImageIcon("r.jpg");
			add.setIcon(icon);
			
		} else if (e.getSource() == yellow){
			ImageIcon icon = new ImageIcon("y.jpg");
			add.setIcon(icon);

		} else {
			ImageIcon icon = new ImageIcon("g.jpg");
			add.setIcon(icon);
		}
		
		
		add(add);
		setVisible(true);
	}

}
