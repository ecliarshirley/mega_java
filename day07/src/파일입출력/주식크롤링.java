package ���������;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextArea;

public class �ֽ�ũ�Ѹ� {
	private JTextField Code;

	public �ֽ�ũ�Ѹ�() {
		JFrame f = new JFrame("���� �ֽ� ũ�Ѹ�");
		f.getContentPane().setBackground(new Color(100, 149, 237));
		f.setSize(400, 800);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JTextArea result = new JTextArea();
		JButton btnNewButton = new JButton("\uBAA8 \uB098 \uBBF8");
		btnNewButton.setFont(new Font("����", Font.PLAIN, 55));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				result.setText("");
					try {
					Document doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=005360").get();
					Elements elist = doc.select("span.blind");
					
					String today = elist.get(12).text();
					System.out.println("����: " + today);

					String yesterday = elist.get(15).text();
					System.out.println("����: " + yesterday);
					
					String yhigh = elist.get(16).text();
					System.out.println("���� ��: " + yhigh);
					
					String siga = elist.get(19).text();
					System.out.println("�ð�: " + siga + "\n");
					
					result.append("����: " + today+ "\n");
					result.append("����: " + yesterday+ "\n");
					result.append("���� ��: " + yhigh+ "\n");
					result.append("�ð�: " + siga + "\n");
					
					} catch (Exception e1) {
					}
				}	
		});
		
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC0BC\uC131\uC804\uC790");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText("");
				try {
					Document doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=005930").get();
					Elements elist = doc.select("span.blind");
					
					String today = elist.get(12).text();
					System.out.println("����: " + today);

					String yesterday = elist.get(15).text();
					System.out.println("����: " + yesterday);
					
					String yhigh = elist.get(16).text();
					System.out.println("���� ��: " + yhigh);
					
					String siga = elist.get(19).text();
					System.out.println("�ð�: " + siga + "\n");
					
					result.append("����: " + today+ "\n");
					result.append("����: " + yesterday+ "\n");
					result.append("���� ��: " + yhigh+ "\n");
					result.append("�ð�: " + siga + "\n");
					
					} catch (Exception e1) {
					}
				
				
			}
		});
		btnNewButton_1.setFont(new Font("����", Font.PLAIN, 55));
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uC140\uD2B8\uB9AC\uC628");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText("");
				try {
					Document doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=068270").get();
					Elements elist = doc.select("span.blind");
					
					String today = elist.get(12).text();
					System.out.println("����: " + today);

					String yesterday = elist.get(15).text();
					System.out.println("����: " + yesterday);
					
					String yhigh = elist.get(16).text();
					System.out.println("���� ��: " + yhigh);
					
					String siga = elist.get(19).text();
					System.out.println("�ð�: " + siga + "\n");
					
					result.append("����: " + today+ "\n");
					result.append("����: " + yesterday+ "\n");
					result.append("���� ��: " + yhigh+ "\n");
					result.append("�ð�: " + siga + "\n");
					
					} catch (Exception e1) {
					}
				
			}
		});
		btnNewButton_2.setFont(new Font("����", Font.PLAIN, 55));
		f.getContentPane().add(btnNewButton_2);
		
		JLabel lblCode = new JLabel("code:");
		lblCode.setForeground(new Color(255, 0, 0));
		lblCode.setFont(new Font("����", Font.PLAIN, 55));
		f.getContentPane().add(lblCode);
		
		Code = new JTextField();
		Code.setFont(new Font("����", Font.PLAIN, 38));
		f.getContentPane().add(Code);
		Code.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("\uD06C\uB864\uB9C1\uC2DC\uC791");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText("");
				try {
					String cc = Code.getText();
					Document doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + cc).get();
					Elements elist = doc.select("span.blind");
					
					String today = elist.get(12).text();
					System.out.println("����: " + today);

					String yesterday = elist.get(15).text();
					System.out.println("����: " + yesterday);
					
					String yhigh = elist.get(16).text();
					System.out.println("���� ��: " + yhigh);
					
					String siga = elist.get(19).text();
					System.out.println("�ð�: " + siga + "\n");
					
					result.append("����: " + today+ "\n");
					result.append("����: " + yesterday+ "\n");
					result.append("���� ��: " + yhigh+ "\n");
					result.append("�ð�: " + siga + "\n");
					
					} catch (Exception e1) {
					}
				
			}
		});
		btnNewButton_3.setFont(new Font("����", Font.PLAIN, 28));
		f.getContentPane().add(btnNewButton_3);
		
		
		result.setRows(5);
		result.setFont(new Font("Monospaced", Font.PLAIN, 33));
		result.setColumns(20);
		f.getContentPane().add(result);
		
		
		f.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		�ֽ�ũ�Ѹ� name = new �ֽ�ũ�Ѹ�();
	}

}
