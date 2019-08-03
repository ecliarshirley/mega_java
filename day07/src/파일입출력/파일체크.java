package 파일입출력;

import java.io.File;

public class 파일체크 {

	public static void main(String[] args) {
		File file = new File("D:\\shirley\\day07");
		System.out.println(file.exists());  	//true
		System.out.println(file.isDirectory()); //true
		System.out.println(file.isFile()); 		// false
		
		String[] list = file.list();
		for (String s : list) {
			System.out.println(s);
		}
		
		System.out.println(list.length);
	}

}
