package ����;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class �������� {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �̸�: ");
		String name = sc.next();
		System.out.print("����: ");
		String age = sc.next();
		System.out.print("�� �б�: ");
		String SchoolName = sc.next();
		
		FileWriter file = new FileWriter( name + ".txt");
		
		
			file.write(name + "\n");
			file.write(age + "\n");
			file.write(SchoolName + "\n");
		
		file.close();
		
	}

}
