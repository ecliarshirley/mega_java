package �迭;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class ����200�¼� extends JFrame{

	public ����200�¼�() {
		setTitle("��ư 200 �¼� ���� ���Žý���");
		setSize(600, 800);
		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);
		
		Random r = new Random();
		Color[] color = {Color.yellow, Color.blue, Color.green, Color.pink, Color.cyan};
		
		
		JButton[] buttons = new JButton[200];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(i + ""); //""�� string���� �ٲ�
//			buttons[i].setBackground(Color.yellow);
			
			int index = r.nextInt(5);
			buttons[i].setBackground(color[index]);
			
			
			
			getContentPane().add(buttons[i]);
			buttons[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("���� ��ư ����");
					String data = e.getActionCommand();
					System.out.println(data); //1
					if(!data.equals("����")) {
						int data2 = Integer.parseInt(data);
						buttons[data2].setText("����");
						buttons[data2].setEnabled(false); //�̹� ���� �Ŵ� ��ư�� ����.(���̻� �� ������)
					}
					
				}
			});
		}
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		����200�¼� name = new ����200�¼�();
		
	}

}
