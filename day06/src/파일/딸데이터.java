package 파일;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class 딸데이터 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("딸 이름: ");
		String name = sc.next();
		System.out.print("나이: ");
		String age = sc.next();
		System.out.print("딸 학교: ");
		String SchoolName = sc.next();
		
		FileWriter file = new FileWriter( name + ".txt");
		
		
			file.write(name + "\n");
			file.write(age + "\n");
			file.write(SchoolName + "\n");
		
		file.close();
		
	}

}
