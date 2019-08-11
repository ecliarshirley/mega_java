package 생성자;

import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

class 나의그래픽 {

	public 나의그래픽() {
		JFrame f = new JFrame("나의 그래픽");
		f.setSize(700, 500);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		ImageIcon icon2 = new ImageIcon("001.jpg");
		JButton b1 = new JButton();
		b1.setIcon(icon2);
		
		//add는 f에 올려준다.
		f.add(b1);
		
		JButton b2 = new JButton("나도 버튼");
		f.add(b2);
		
		JButton b3 = new JButton("버튼3");
		f.add(b3);
		
		ImageIcon icon = new ImageIcon("005.png");

		JButton b4 = new JButton(icon);
		f.add(b4);
		
		
		
		
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {

		나의그래픽 me = new 나의그래픽();
		
		
	}

}
