package ��Ŭ�������;

import javax.swing.JFrame;
import javax.swing.JTable;

public class �Խ��Ǹ���� extends JFrame{

	public �Խ��Ǹ����() {
		setTitle("�Խ���");
		setSize(500, 500);
		
		String[] items = {"��ȣ", "����", "����", "��¥"};
		
		
		Object[][] data = {
				{"1","java","fun java","2019-08-09"},
				{"2","jsp","fun jsp","2019-08-10"},
				{"3","Spring","fun Spring","2019-08-11"},
		};
		
		JTable table = new JTable(data, items);
		add(table);
		
		setVisible(true);
	
	}
	
	
	public static void main(String[] args) {
		�Խ��Ǹ���� name = new �Խ��Ǹ����();
	}

}
