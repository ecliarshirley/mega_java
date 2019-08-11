package 내클래스사용;

import java.awt.FlowLayout;
import java.awt.ScrollPane;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DB프로그램.DB연결;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 게시판만들기2 extends JFrame{
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;

	public 게시판만들기2() {
		getContentPane().setBackground(new Color(135, 206, 235));
		getContentPane().setLayout(new FlowLayout());
		
		JPanel p1 = new JPanel(); //제목 
		p1.setBackground(new Color(30, 144, 255));
		JPanel p2 = new JPanel(); //게시판리스트
		p2.setBackground(new Color(219, 112, 147));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\tjsc2-202-01\\Desktop\\c1.JPG"));
		getContentPane().add(btnNewButton);
		
		
		JLabel l = new JLabel("게시판");
		l.setFont(new Font("굴림", Font.PLAIN, 24));
		l.setBackground(new Color(30, 144, 255));
		p1.add(l);
		getContentPane().add(p1);
		getContentPane().add(p2);
		
		setTitle("게시판");
		setSize(500, 620);
		
		String[] items = {"번호", "제목", "내용", "날짜"};
		
		
		Object[][] data = {
				{"1","java","fun java","2019-08-09"},
				{"2","jsp","fun jsp","2019-08-10"},
				{"3","Spring","fun Spring","2019-08-11"},
				{"1","java","fun java","2019-08-09"},
				{"2","jsp","fun jsp","2019-08-10"},
				{"3","Spring","fun Spring","2019-08-11"},
				{"1","java","fun java","2019-08-09"},
				{"2","jsp","fun jsp","2019-08-10"},
				{"3","Spring","fun Spring","2019-08-11"},
				{"1","java","fun java","2019-08-09"},
				{"2","jsp","fun jsp","2019-08-10"},
				{"3","Spring","fun Spring","2019-08-11"},
				{"1","java","fun java","2019-08-09"},
				{"2","jsp","fun jsp","2019-08-10"},
				{"3","Spring","fun Spring","2019-08-11"},
				{"1","java","fun java","2019-08-09"},
				{"2","jsp","fun jsp","2019-08-10"},
				{"3","Spring","fun Spring","2019-08-11"},
				{"1","java","fun java","2019-08-09"},
				{"2","jsp","fun jsp","2019-08-10"},
				{"3","Spring","fun Spring","2019-08-11"},
				{"1","java","fun java","2019-08-09"},
				{"2","jsp","fun jsp","2019-08-10"},
				{"3","Spring","fun Spring","2019-08-11"},
				{"1","java","fun java","2019-08-09"},
				{"2","jsp","fun jsp","2019-08-10"},
				{"3","Spring","fun Spring","2019-08-11"},
				{"1","java","fun java","2019-08-09"},
				{"2","jsp","fun jsp","2019-08-10"},
				{"3","Spring","fun Spring","2019-08-11"},
		};
		
		DefaultTableModel model = new DefaultTableModel(data, items);
		
		JTable table = new JTable(model);
		JScrollPane scroll = new JScrollPane(table);
		
		
		p2.add(scroll);
		
		JLabel lblNo = new JLabel("No.");
		lblNo.setFont(new Font("굴림", Font.PLAIN, 18));
		getContentPane().add(lblNo);
		
		t1 = new JTextField();
		getContentPane().add(t1);
		t1.setColumns(5);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("굴림", Font.PLAIN, 18));
		getContentPane().add(lblName);
		
		t2 = new JTextField();
		getContentPane().add(t2);
		t2.setColumns(10);
		
		JLabel lblContent = new JLabel("content");
		lblContent.setFont(new Font("굴림", Font.PLAIN, 18));
		getContentPane().add(lblContent);
		
		t3 = new JTextField();
		getContentPane().add(t3);
		t3.setColumns(10);
		
		JLabel lblDate = new JLabel("date");
		lblDate.setFont(new Font("굴림", Font.PLAIN, 18));
		getContentPane().add(lblDate);
		
		t4 = new JTextField();
		getContentPane().add(t4);
		t4.setColumns(10);
		
		JButton button = new JButton("\uC791\uC131\uD558\uAE30");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				String s3 = t3.getText();
				String s4 = t4.getText();
				System.out.println(s1);
				System.out.println(s2);
				System.out.println(s3);
				System.out.println(s4);
				
				try {
					DB연결 name = new DB연결(s1, s2, s3, s4);
				} catch (Exception e1) {
				}
				
				
			}
		});
		button.setFont(new Font("굴림", Font.PLAIN, 15));
		button.setBackground(new Color(0, 250, 154));
		getContentPane().add(button);
		
		setVisible(true);
	
	}
	
	
	public static void main(String[] args) {
		게시판만들기2 name = new 게시판만들기2();
	}

}
