package ���������;

import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class �ϱ���α��� {
	public �ϱ���α���() {
		JFrame f = new JFrame("�ϱ���");
		f.setSize(650, 900);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel img = new JLabel();
		ImageIcon icon = new ImageIcon("d.jpg");
		img.setIcon(icon);
		f.getContentPane().add(img);
		
		JLabel l1 = new JLabel("id �Է�");
		f.getContentPane().add(l1);
		
		TextField t1 = new TextField(10);
		f.getContentPane().add(t1);
		
		JLabel l2 = new JLabel("pw �Է�");
		f.getContentPane().add(l2);
		TextField t2 = new TextField(10);
		f.getContentPane().add(t2);
		
		JButton b = new JButton("�α��� ó��");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//��ư�� ������ �� �Է� �� ������ ����
				String s1 = t1.getText();  //id
				String s2 = t2.getText();  //pw
				
				System.out.println("�Է�id :" + s1);
				System.out.println("�Է�pw :" + s2);
				
				String id = "root";
				String pw = "1234";
				
				if (id.equals(s1) && pw.equals(s2)) {
					System.out.println("�α��� ok");
					�ϱ��� diary = new �ϱ���();
										
				} else {
					System.out.println("�α��� error");
					JOptionPane.showMessageDialog(null, "�ٽ� �α��� �� �ּ���");
					t1.setText("");
					t2.setText("");
					
				}
				
				
				
				
			}
		});
		f.getContentPane().add(b);
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		�ϱ���α��� name = new �ϱ���α���();
		//�̷��� �ϸ� �ϱ��� �α��� �޼ҵ尡 �ڵ� ȣ�� ��.
		//main ���� static �� �ص� �Ǽ� �뷮�� ������
		
		
		
	}

}
