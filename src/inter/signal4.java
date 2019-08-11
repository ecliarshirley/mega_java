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

public class signal4 extends JFrame {
	JButton red, blue, yellow; //Àü¿ªº¯¼ö·Î »­. 
	//Å¬·¡½º ³» ¸ðµç °÷¿¡¼­ Á¢±Ù °¡´É
	

	public signal4() {
		setTitle("½ÅÈ£µî4");
		setSize(500,800);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		red = new JButton("\uBE68\uAC15\uC2E0\uD638");
		red.setForeground(Color.BLACK);
		red.setFont(new Font("±¼¸²", Font.PLAIN, 99));
		red.setBackground(Color.RED);
		getContentPane().add(red);
		
		yellow = new JButton("\uB178\uB791\uC2E0\uD638");
		yellow.setFont(new Font("±¼¸²", Font.PLAIN, 99));
		yellow.setBackground(Color.YELLOW);
		yellow.setForeground(Color.BLACK);
		yellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("³ë¶û");
			}
		});
		getContentPane().add(yellow);
		
		blue = new JButton("\uD30C\uB791\uC2E0\uD638");
		blue.setFont(new Font("±¼¸²", Font.PLAIN, 99));
		blue.setBackground(Color.BLUE);
		blue.setForeground(Color.BLACK);
		blue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("ÆÄ¶û");
			}
		});
		getContentPane().add(blue);
		
		red.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("»¡°­");
			}
		});
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		signal4 name = new signal4();
	}

	
}
