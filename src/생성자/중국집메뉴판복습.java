package ������;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class �߱����޴��Ǻ��� {
	static int count = 0;
	static int sum = 0;  //�� ���� �ݾ�
	static int j = 0; //¥��� ���� ��
	static int z = 0; //«��
	static int w = 0; //�쵿

	public static void main(String[] args) {

		JFrame f = new JFrame("�߱��� �޴���");
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
		t1.setText(count + "��");
		f.getContentPane().add(t2);
		
		JLabel result2 = new JLabel("��� ���÷���");
		
		JButton b1 = new JButton("¥���");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("f1.jpg");
				img.setIcon(icon);
				f.getContentPane().add(img);
				count++;
				t1.setText(count + "��");
				j++;
			}
		});
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("«��");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("f2.jpg");
				img.setIcon(icon);
				f.getContentPane().add(img);
				count++;
				t1.setText(count + "��");
				z++;
			}
		});
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("�쵿");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("f3.jpg");
				img.setIcon(icon);
				f.getContentPane().add(img);
				count++;
				t1.setText(count + "��");
				w++;
			}
		});
		f.getContentPane().add(b3);
		
		
		
		JButton result = new JButton("����� �ҷ�����");
		result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum = count * 5000;
				t2.setText(sum + "��");
				
				result2.setText("¥���" + j + "«��" + z + "�쵿" + w);
			}
		});
		f.getContentPane().add(result);
		
		JButton zero = new JButton("���� �ʱ�ȭ");
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
