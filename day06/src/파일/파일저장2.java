package ����;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class ��������2 {

	public static void main(String[] args) throws Exception {
		//���ϻ���, ��¿� stream(���)
		FileWriter file = new FileWriter("test2.txt");
		
		for (int i = 0; i < 3; i++) {
			String data = JOptionPane.showInputDialog("�Էµ�����");
			file.write(data + "\n");
		}
		
		//stream ����
		file.close();
	}

}
