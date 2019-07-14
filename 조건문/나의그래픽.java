package 조건문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.setTitle("나의 첫 그래픽");
		
		JButton btnNewButton = new JButton("\uB098\uB97C \uB20C\uB7EC\uC694");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("가운데 버튼을 눌렀군요.");
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setFont(new Font("한컴 솔잎 M", Font.PLAIN, 25));
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		JButton button = new JButton("\uC704\uC5D0 \uC788\uB294 \uBC84\uD2BC");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("위에 있는 버튼을 눌렀네요");
			}
		});
		button.setBackground(Color.RED);
		f.getContentPane().add(button, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("\uC67C\uCABD \uBC84\uD2BC");
		btnNewButton_1.setBackground(Color.YELLOW);
		btnNewButton_1.setForeground(Color.ORANGE);
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 16));
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("\uC624\uB978\uCABD \uBC84\uD2BC");
		btnNewButton_2.setBackground(Color.CYAN);
		btnNewButton_2.setForeground(Color.ORANGE);
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 16));
		f.getContentPane().add(btnNewButton_2, BorderLayout.EAST);
		
		JButton btnNewButton_3 = new JButton("\uC544\uB798 \uC788\uB294 \uBC84\uD2BC");
		btnNewButton_3.setBackground(Color.GREEN);
		btnNewButton_3.setFont(new Font("굴림체", Font.PLAIN, 16));
		f.getContentPane().add(btnNewButton_3, BorderLayout.SOUTH);
		
		
		f.setVisible(true);
		
	}

}
