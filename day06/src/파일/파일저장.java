package ����;

import java.io.FileWriter;
import java.io.IOException;

public class �������� {

	public static void main(String[] args) throws Exception {
		//�ܺ� �ڿ��� ������ �� 
		//����, ��Ʈ��ũ, db ���α׷��� �ٷ� ��
		//������ ����ó�� �ؾ� ��.
		FileWriter file = new FileWriter("test.txt");
		file.write("hello java" + "\n");
		file.write("bye java"+ "\n");
		file.close();
		
	}

}
