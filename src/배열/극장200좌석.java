package 배열;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class 극장200좌석 extends JFrame{

	public 극장200좌석() {
		setTitle("버튼 200 좌석 극장 예매시스템");
		setSize(600, 800);
		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);
		
		Random r = new Random();
		Color[] color = {Color.yellow, Color.blue, Color.green, Color.pink, Color.cyan};
		
		
		JButton[] buttons = new JButton[200];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(i + ""); //""로 string으로 바꿈
//			buttons[i].setBackground(Color.yellow);
			
			int index = r.nextInt(5);
			buttons[i].setBackground(color[index]);
			
			
			
			getContentPane().add(buttons[i]);
			buttons[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("예약 버튼 누름");
					String data = e.getActionCommand();
					System.out.println(data); //1
					if(!data.equals("예약")) {
						int data2 = Integer.parseInt(data);
						buttons[data2].setText("예약");
						buttons[data2].setEnabled(false); //이미 누른 거는 버튼이 죽음.(더이상 못 누르게)
					}
					
				}
			});
		}
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		극장200좌석 name = new 극장200좌석();
		
	}

}
