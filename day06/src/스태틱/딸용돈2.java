package ½ºÅÂÆ½;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class µþ¿ëµ·2 {
	int dongCount;
	int sonCount;
	
	public µþ¿ëµ·2() {
		JFrame f = new JFrame("µþ ¿ëµ· ±×·¡ÇÈ");
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(350, 750);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
				
		JLabel l1 = new JLabel("µþ ÀÌ¸§");
		l1.setFont(new Font("±¼¸²", Font.PLAIN, 27));
		JTextField name = new JTextField(10);
		name.setFont(new Font("±¼¸²", Font.PLAIN, 27));
		f.getContentPane().add(l1);
		f.getContentPane().add(name);
		
		JLabel l4 = new JLabel();
		JLabel l5 = new JLabel();

		
		JLabel l2 = new JLabel("µþ ³ªÀÌ");
		l2.setFont(new Font("±¼¸²", Font.PLAIN, 27));
		JTextField age = new JTextField(10);
		age.setFont(new Font("±¼¸²", Font.PLAIN, 27));
		f.getContentPane().add(l2);
		f.getContentPane().add(age);
		
		
		JButton daddy = new JButton("¾Æºü ¿ëµ· ÁÖ¼¼¿ä");
		
		JTextArea list = new JTextArea(11,30);
		list.setFont(new Font("Monospaced", Font.PLAIN, 16));
		
		
		
		JLabel l3 = new JLabel("ÀÜ¾×: " + µþ¿ëµ·wallet.wallet + "¿ø");
		daddy.setBackground(Color.CYAN);
		daddy.setForeground(Color.BLUE);
		daddy.setFont(new Font("±¼¸²", Font.PLAIN, 27));
		daddy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = name.getText();
				String s2 = age.getText();
			
				int agei = Integer.parseInt(s2);
				
				µþ¿ëµ·wallet µþ1 = new µþ¿ëµ·wallet(s1, agei);
				µþ¿ëµ·wallet.wallet = µþ¿ëµ·wallet.wallet - 1000;
				int result = µþ¿ëµ·wallet.wallet;
				
				l3.setText("ÀÜ¾×" + result + "¿ø");
				
				if (s1.equals("È«±æµ¿")) {
					dongCount++;
				} else if(s1.equals("È«±æ¼ø")) {
					sonCount++;
				} else {
					System.out.println("ÇØ´ç µþ ÀÌ¸§ ¾øÀ½");
				}
				
				l4.setText("È«±æµ¿: " + (dongCount * 1000) +"¿ø");
				l5.setText("È«±æ¼ø: " + (sonCount*1000)+"¿ø");
				//±âÁ¸°Å ³ªµÎ°í °è¼Ó ½×¿©¼­ »õ·Î¿î ±ÛÀÌ ½×ÀÌ°Ô
//				list.append(µþ1 + "\n");
				
				
				//1. ÆÄÀÏ»ý¼º ("c:/temp/" + s1 + ".txt")
				//2.µþ ÀÌ¸§, µþ ³ªÀÌ ÀúÀå
				//3. ¿¡·¯Ã³¸® (try, catch)
				
//				try {
//					FileWriter file = new FileWriter("c:/temp/" + s1 + ".txt");
//					file.write(name + "\n");
//					file.write(age + "\n");
//					file.close();
//				} catch (IOException e1) {
//					e1.printStackTrace();
//				}
				
				
				//¶Ç ÇØº¸±â
				try {
					FileWriter file = new FileWriter(s1 + ".txt");
					file.write(s1 + "\n");
					file.write(s2 + "\n");
					
					if (s1.equals("È«±æµ¿")) {
						file.write(s1 + (dongCount * 1000) +"¿ø"+ "\n");
						list.append(µþ1 + "\n");
					} else if(s1.equals("È«±æ¼ø")) {
						file.write(s1 + (sonCount * 1000) +"¿ø"+ "\n");
						list.append(µþ1 + "\n");
					} else {
						System.out.println("ÇØ´ç µþ ÀÌ¸§ ¾øÀ½");
					}
					
										
					file.close();
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		f.getContentPane().add(daddy);
		
		l3.setFont(new Font("±¼¸²", Font.PLAIN, 27));
		f.getContentPane().add(l3);
		
		
		
		f.add(l4);
		f.add(l5);
		f.getContentPane().add(list);
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		µþ¿ëµ·2 name = new µþ¿ëµ·2();
		
		
	}

}
