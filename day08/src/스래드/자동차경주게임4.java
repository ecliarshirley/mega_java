package ������;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class �ڵ������ְ���4 extends JFrame {
	//���� Ŭ����
	//�� Ŭ������ �������� �������� ����ؾ� �ϴ� �������� �� Ŭ������ ���������� �ִ� ���,
	//�̸� �ϳ��� Ŭ���������� ���ؼ� ��� ����.
	
	public class CarThread extends Thread {
		int x, y;
		ImageIcon icon;
		JLabel label;
		
		
		public CarThread(String file, int x, int y) {
			this.x = x;
			this.y = y;
			label = new JLabel(file);
			label.setBounds(x, y, 100, 100);
			add(label);
		}
		
		Random random = new Random();
		@Override
		public void run() {
			for (int i = 0; i < 100; i++) {
				x = x + random.nextInt(10);
				label.setBounds(x, y, 100, 100);
				try {
					Thread.sleep(500); //1000�� 1����. 500�� .5��
				} catch (Exception e) {
				}
			}
		}
	}
	
	public �ڵ������ְ���4() {
		setTitle("�ڵ��� ���ְ���");
		setSize(600, 250);
		setLayout(null); //�ڵ����� ��ġ���ִ� class��� ����.
		
		CarThread car1 = new CarThread("����", 100, 0); //x �� 100, y�� 0
		CarThread car2 = new CarThread("������", 100, 50); 
		CarThread car3 = new CarThread("BMW", 100, 100);
		
		car1.start();
		car2.start();
		car3.start();
		
		setVisible(true);	
	}
	
	public static void main(String[] args) {
		�ڵ������ְ���4 name = new �ڵ������ְ���4();
	}

}
