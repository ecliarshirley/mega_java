package 파일;

import java.io.FileWriter;
import java.io.IOException;

public class 파일저장 {

	public static void main(String[] args) throws Exception {
		//외부 자원을 연결할 때 
		//파일, 네트워크, db 프로그램을 다룰 때
		//무저건 에러처리 해야 함.
		FileWriter file = new FileWriter("test.txt");
		file.write("hello java" + "\n");
		file.write("bye java"+ "\n");
		file.close();
		
	}

}
