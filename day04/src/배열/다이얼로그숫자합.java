package 배열;

import javax.swing.JOptionPane;

public class 다이얼로그숫자합 {

	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("숫자1을 입력하세요");
		String input2 = JOptionPane.showInputDialog("숫자2을 입력하세요");
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);

		int sum = num1 + num2;
		
		int num3 = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "두 수의 합은: " + num3);
//		System.out.println(sum);
	
	
	}

}
