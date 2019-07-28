package ½ºÅÂÆ½;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class µþ¿ëµ· {

	public µþ¿ëµ·() {
		JFrame f = new JFrame("µþ ¿ëµ· ±×·¡ÇÈ");
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(400, 250);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		Scanner sc = new Scanner(System.in);
				
		JLabel l1 = new JLabel("µþ ÀÌ¸§");
		l1.setFont(new Font("±¼¸²", Font.PLAIN, 27));
		JTextField name = new JTextField(10);
		name.setFont(new Font("±¼¸²", Font.PLAIN, 27));
		f.getContentPane().add(l1);
		f.getContentPane().add(name);
		
		
		JLabel l2 = new JLabel("µþ ³ªÀÌ");
		l2.setFont(new Font("±¼¸²", Font.PLAIN, 27));
		JTextField age = new JTextField(10);
		age.setFont(new Font("±¼¸²", Font.PLAIN, 27));
		f.getContentPane().add(l2);
		f.getContentPane().add(age);
		
		
//		JLabel l4 = new JLabel("µþ ÀÌ¸§: " + name + "µþ ³ªÀÌ: " + age);
//		f.add(l4);
		
		JButton daddy = new JButton("¾Æºü ¿ëµ· ÁÖ¼¼¿ä");
		JLabel l3 = new JLabel("ÀÜ¾×: " + µþ¿ëµ·wallet.wallet + "¿ø");
		daddy.setBackground(Color.CYAN);
		daddy.setForeground(Color.BLUE);
		daddy.setFont(new Font("±¼¸²", Font.PLAIN, 29));
		daddy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = name.getText();
				String s2 = age.getText();
				int agei = Integer.parseInt(s2);
				
				µþ¿ëµ·wallet µþ1 = new µþ¿ëµ·wallet(s1, agei);
				µþ¿ëµ·wallet.wallet = µþ¿ëµ·wallet.wallet - 1000;
				int result = µþ¿ëµ·wallet.wallet;
				
				l3.setText("ÀÜ¾×" + result + "¿ø");
				
				JOptionPane.showMessageDialog(null, "µþ: " + µþ1);

				
			}
		});
		f.getContentPane().add(daddy);
		
		l3.setFont(new Font("±¼¸²", Font.PLAIN, 27));
		f.getContentPane().add(l3);
		
		

		
		
		
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		µþ¿ëµ· name = new µþ¿ëµ·();
		
		
	}

}
