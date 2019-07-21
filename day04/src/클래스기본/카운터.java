package 클래스기본;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class 카운터 {
	static int count = 0;
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		//프레임 부품 1
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.ORANGE);
		f.setTitle("나의 카운터");
		f.setSize(350, 900);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label = new JLabel("\uC22B\uC7901");
		f.getContentPane().add(label);
		
		t1 = new JTextField();
		t1.setForeground(new Color(0, 0, 255));
		t1.setBackground(new Color(245, 245, 220));
		t1.setFont(new Font("굴림", Font.PLAIN, 35));
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uC22B\uC7902");
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setForeground(new Color(0, 0, 255));
		t2.setBackground(new Color(245, 245, 220));
		t2.setFont(new Font("굴림", Font.PLAIN, 35));
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\shirley\\day04\\\uACC4\uC0B0\uAE30.JPG"));
		f.getContentPane().add(lblNewLabel);
		
		JLabel result = new JLabel("0");

		
		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("+ 버튼을 누르셨군요");
//				count++;
				//두 개의 숫자 값을 가지고 와야 한다.
				String s1 = t1.getText();   //컴퓨터는 숫자를 문자처럼
				String s2 = t2.getText();   //컴퓨터는 숫자를 문자처럼
				System.out.println(s1 + "," + s2);
				
				//모든 입력값은 다 String 이다. -> int 로 변환한다.
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				
				// + 연산
				int n3 = n1 + n2;				
				
				//result에 결과 값 넣어준다.		
				result.setText(n3 +"");
				
//				result.setText(count+""); //int count를 스트링으로 바꿈 +"" 넣음으로
			}
		});
		button.setFont(new Font("굴림", Font.PLAIN, 99));
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("0");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("0 을 누르셨군요");
				
				result.setText(0+"");
				t1.setText("");
				t2.setText("");
				
//				count = 0;
//				result.setText(count+"");
			}
		});
		button_1.setFont(new Font("굴림", Font.PLAIN, 99));
		f.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("-");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("- 를 누르셨군요");

				//두 개의 숫자 값을 가지고 와야 한다.
				String s1 = t1.getText();   //컴퓨터는 숫자를 문자처럼
				String s2 = t2.getText();   //컴퓨터는 숫자를 문자처럼
				System.out.println(s1 + "," + s2);
				
				//모든 입력값은 다 String 이다. -> int 로 변환한다.
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);			
			
				// + 연산
				int n3 = n1 - n2;	
				//result에 결과 값 넣어준다.		
				result.setText(n3 +"");
				
				
//				count--;
//				result.setText(count+""); //int count를 스트링으로 바꿈 +"" 넣음으로
			}
		});
		button_2.setFont(new Font("굴림", Font.PLAIN, 99));
		f.getContentPane().add(button_2);
		
		result.setForeground(Color.RED);
		result.setFont(new Font("굴림", Font.PLAIN, 99));
		f.getContentPane().add(result);
		
		
		// 배치부품1
		
		//라벨 (이미지, 글자) 부품2
		
		//이미지 부품1
		
		//버튼 부품 3
		
		
		
		f.setVisible(true);

	}

}
