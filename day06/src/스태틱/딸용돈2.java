package ����ƽ;

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

public class ���뵷2 {
	int dongCount;
	int sonCount;
	
	public ���뵷2() {
		JFrame f = new JFrame("�� �뵷 �׷���");
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(350, 750);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
				
		JLabel l1 = new JLabel("�� �̸�");
		l1.setFont(new Font("����", Font.PLAIN, 27));
		JTextField name = new JTextField(10);
		name.setFont(new Font("����", Font.PLAIN, 27));
		f.getContentPane().add(l1);
		f.getContentPane().add(name);
		
		JLabel l4 = new JLabel();
		JLabel l5 = new JLabel();

		
		JLabel l2 = new JLabel("�� ����");
		l2.setFont(new Font("����", Font.PLAIN, 27));
		JTextField age = new JTextField(10);
		age.setFont(new Font("����", Font.PLAIN, 27));
		f.getContentPane().add(l2);
		f.getContentPane().add(age);
		
		
		JButton daddy = new JButton("�ƺ� �뵷 �ּ���");
		
		JTextArea list = new JTextArea(11,30);
		list.setFont(new Font("Monospaced", Font.PLAIN, 16));
		
		
		
		JLabel l3 = new JLabel("�ܾ�: " + ���뵷wallet.wallet + "��");
		daddy.setBackground(Color.CYAN);
		daddy.setForeground(Color.BLUE);
		daddy.setFont(new Font("����", Font.PLAIN, 27));
		daddy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = name.getText();
				String s2 = age.getText();
			
				int agei = Integer.parseInt(s2);
				
				���뵷wallet ��1 = new ���뵷wallet(s1, agei);
				���뵷wallet.wallet = ���뵷wallet.wallet - 1000;
				int result = ���뵷wallet.wallet;
				
				l3.setText("�ܾ�" + result + "��");
				
				if (s1.equals("ȫ�浿")) {
					dongCount++;
				} else if(s1.equals("ȫ���")) {
					sonCount++;
				} else {
					System.out.println("�ش� �� �̸� ����");
				}
				
				l4.setText("ȫ�浿: " + (dongCount * 1000) +"��");
				l5.setText("ȫ���: " + (sonCount*1000)+"��");
				//������ ���ΰ� ��� �׿��� ���ο� ���� ���̰�
//				list.append(��1 + "\n");
				
				
				//1. ���ϻ��� ("c:/temp/" + s1 + ".txt")
				//2.�� �̸�, �� ���� ����
				//3. ����ó�� (try, catch)
				
//				try {
//					FileWriter file = new FileWriter("c:/temp/" + s1 + ".txt");
//					file.write(name + "\n");
//					file.write(age + "\n");
//					file.close();
//				} catch (IOException e1) {
//					e1.printStackTrace();
//				}
				
				
				//�� �غ���
				try {
					FileWriter file = new FileWriter(s1 + ".txt");
					file.write(s1 + "\n");
					file.write(s2 + "\n");
					
					if (s1.equals("ȫ�浿")) {
						file.write(s1 + (dongCount * 1000) +"��"+ "\n");
						list.append(��1 + "\n");
					} else if(s1.equals("ȫ���")) {
						file.write(s1 + (sonCount * 1000) +"��"+ "\n");
						list.append(��1 + "\n");
					} else {
						System.out.println("�ش� �� �̸� ����");
					}
					
										
					file.close();
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		f.getContentPane().add(daddy);
		
		l3.setFont(new Font("����", Font.PLAIN, 27));
		f.getContentPane().add(l3);
		
		
		
		f.add(l4);
		f.add(l5);
		f.getContentPane().add(list);
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		���뵷2 name = new ���뵷2();
		
		
	}

}
