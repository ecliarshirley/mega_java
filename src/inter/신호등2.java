package inter;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

public class ��ȣ��2 extends JFrame{

	public ��ȣ��2() {
		setTitle("��ȣ��2");
		setSize(500,600);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		JButton red = new JButton("\uBE68\uAC15\uC2E0\uD638");
		red.setForeground(Color.BLACK);
		red.setFont(new Font("����", Font.PLAIN, 99));
		red.setBackground(Color.RED);
		getContentPane().add(red);
		
		JButton yellow = new JButton("\uB178\uB791\uC2E0\uD638");
		yellow.setFont(new Font("����", Font.PLAIN, 99));
		yellow.setBackground(Color.YELLOW);
		yellow.setForeground(Color.BLACK);
		yellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		getContentPane().add(yellow);
		
		JButton blue = new JButton("\uD30C\uB791\uC2E0\uD638");
		blue.setFont(new Font("����", Font.PLAIN, 99));
		blue.setBackground(Color.BLUE);
		blue.setForeground(Color.BLACK);
		blue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		getContentPane().add(blue);
		
		���ó���� all = new ���ó����();
		red.addActionListener(all);
		yellow.addActionListener(all);
		blue.addActionListener(all);
		
		
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		��ȣ��2 name = new ��ȣ��2();
	}

}
