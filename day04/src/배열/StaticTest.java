package �迭;

import javax.swing.JOptionPane;

public class StaticTest {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "ȯ���մϴ�.");
		
		String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���:");
//		String name = sc.next(); //String�Է°� ����
		
		System.out.println("����� �̸��� " + name + "�Դϴ�.");
		
		String input = JOptionPane.showInputDialog("�����Է�:");
		int age = Integer.parseInt(input); //parse= �Է°��� �м��ؼ� int�� �ٲ�
		System.out.println("���⳪�̴�" + (age+1));

		
		
	
	}

}
