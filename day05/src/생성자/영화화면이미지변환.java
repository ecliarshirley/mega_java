package 생성자;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 영화화면이미지변환 {
	
	public 영화화면이미지변환() {
		JFrame f = new JFrame("나의 영화 앨범");
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		f.setSize(320, 480);
		
		JButton img = new JButton();
		ImageIcon icon = new ImageIcon("m1.png");
		img.setIcon(icon);
		f.getContentPane().add(img);
		
		JButton b1 = new JButton("어스");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("m1.png");
				img.setIcon(icon);
			}
		});
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("돈");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("m2.png");
				img.setIcon(icon);
				
			}
		});
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("캡틴마블");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("m3.png");
				img.setIcon(icon);
			
			}
		});
		f.getContentPane().add(b3);
		
		f.setVisible(true);
	}

	public static void main(String[] args) {
		영화화면이미지변환 name = new 영화화면이미지변환();
	}

}
