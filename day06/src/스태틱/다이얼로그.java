package 스태틱;

import javax.swing.JOptionPane;

public class 다이얼로그 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "나는 메세지 창");
		
		String age = JOptionPane.showInputDialog("나이입력");
		int agei = Integer.parseInt(age);
		System.out.println("내년나이는: " + (agei + 1));
	}

}
