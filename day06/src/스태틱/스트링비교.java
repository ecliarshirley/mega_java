package ����ƽ;

import javax.swing.JOptionPane;

public class ��Ʈ���� {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("�̸��Է�");
		int dongCount = 0;
		int sonCount = 0;
		
		//�񱳿����ڴ� �⺻������ Ÿ�� �� �񱳸� ����!
		if (name.equals("ȫ�浿")) {
			dongCount++;
		} else if(name.equals("ȫ���")) {
			sonCount++;
		} else {
			System.out.println("�ش� �� �̸� ����");
		}
		
	}

}
