package 스래드;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 자동차경주게임4 extends JFrame {
	//내부 클래스
	//두 클래스간 변수들이 공동으로 사용해야 하는 변수들이 두 클래스에 나누어져서 있는 경우,
	//이를 하나의 클래스안으로 합해서 사용 가능.
	
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
					Thread.sleep(500); //1000이 1초임. 500은 .5초
				} catch (Exception e) {
				}
			}
		}
	}
	
	public 자동차경주게임4() {
		setTitle("자동차 경주게임");
		setSize(600, 250);
		setLayout(null); //자동으로 배치해주는 class사용 안함.
		
		CarThread car1 = new CarThread("벤츠", 100, 0); //x 축 100, y축 0
		CarThread car2 = new CarThread("렉서스", 100, 50); 
		CarThread car3 = new CarThread("BMW", 100, 100);
		
		car1.start();
		car2.start();
		car3.start();
		
		setVisible(true);	
	}
	
	public static void main(String[] args) {
		자동차경주게임4 name = new 자동차경주게임4();
	}

}
