package �迭;

import javax.swing.JOptionPane;

public class ���̾�α׼����� {

	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("����1�� �Է��ϼ���");
		String input2 = JOptionPane.showInputDialog("����2�� �Է��ϼ���");
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);

		int sum = num1 + num2;
		
		int num3 = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "�� ���� ����: " + num3);
//		System.out.println(sum);
	
	
	}

}
