package DB���α׷�;

import java.sql.*;

public class DB���� {

	public DB����(String id, String title, String content, String day) throws Exception {
		//1. Ŀ���� ����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.Ŀ���� ���� ����!");
		
		//2. DB����
		String url = "jdbc:mysql://localhost:3366/shop";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2.DB���� ����!");
		
		//3. SQL�� ����
		
		String sql = "insert into bbs values (?,?,?,?)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		//ps�� ���� ����
		ps.setString(1, id);
		ps.setString(2, title);
		ps.setString(3, content);
		ps.setString(4, day);
		
		System.out.println("3.SQL �� ���� ����!");

		//4. SQL�� ���� ��û
		ps.executeUpdate();
		System.out.println("4.SQL �� ���� ��û ����!");
		
	}

}
