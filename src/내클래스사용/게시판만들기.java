package 내클래스사용;

import javax.swing.JFrame;
import javax.swing.JTable;

public class 게시판만들기 extends JFrame{

	public 게시판만들기() {
		setTitle("게시판");
		setSize(500, 500);
		
		String[] items = {"번호", "제목", "내용", "날짜"};
		
		
		Object[][] data = {
				{"1","java","fun java","2019-08-09"},
				{"2","jsp","fun jsp","2019-08-10"},
				{"3","Spring","fun Spring","2019-08-11"},
		};
		
		JTable table = new JTable(data, items);
		add(table);
		
		setVisible(true);
	
	}
	
	
	public static void main(String[] args) {
		게시판만들기 name = new 게시판만들기();
	}

}
