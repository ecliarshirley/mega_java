package 스태틱;

import javax.swing.JOptionPane;

public class 스트링비교 {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("이름입력");
		int dongCount = 0;
		int sonCount = 0;
		
		//비교연산자는 기본테이터 타입 값 비교만 가능!
		if (name.equals("홍길동")) {
			dongCount++;
		} else if(name.equals("홍길순")) {
			sonCount++;
		} else {
			System.out.println("해당 딸 이름 없음");
		}
		
	}

}
