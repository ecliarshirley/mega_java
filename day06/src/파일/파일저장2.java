package 파일;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 파일저장2 {

	public static void main(String[] args) throws Exception {
		//파일생성, 출력용 stream(통로)
		FileWriter file = new FileWriter("test2.txt");
		
		for (int i = 0; i < 3; i++) {
			String data = JOptionPane.showInputDialog("입력데이터");
			file.write(data + "\n");
		}
		
		//stream 제거
		file.close();
	}

}
