package 배열;

import javax.swing.JOptionPane;

public class StaticTest {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "환영합니다.");
		
		String name = JOptionPane.showInputDialog("이름을 입력하세요:");
//		String name = sc.next(); //String입력과 같음
		
		System.out.println("당신의 이름은 " + name + "입니다.");
		
		String input = JOptionPane.showInputDialog("나이입력:");
		int age = Integer.parseInt(input); //parse= 입력값을 분석해서 int로 바꿈
		System.out.println("내년나이는" + (age+1));

		
		
	
	}

}
