package ���������;

import java.io.FileWriter;
import java.io.IOException;

public class ���������2 {

	public static void main(String[] args) throws Exception {
		FileWriter file = new FileWriter("test2.txt");
		file.write("love java \n");
		file.write("love spring\n");
		file.write("love jsp\n");
		file.write("this is the end\n");
		file.close();
	}

}
