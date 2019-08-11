package DB프로그램;

import java.sql.*;

public class DB연결 {

	public DB연결(String id, String title, String content, String day) throws Exception {
		//1. 커넥터 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.커넥터 설정 성공!");
		
		//2. DB연결
		String url = "jdbc:mysql://localhost:3366/shop";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2.DB연결 성공!");
		
		//3. SQL문 결정
		
		String sql = "insert into bbs values (?,?,?,?)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		//ps에 매핑 연결
		ps.setString(1, id);
		ps.setString(2, title);
		ps.setString(3, content);
		ps.setString(4, day);
		
		System.out.println("3.SQL 문 결정 성공!");

		//4. SQL문 실행 요청
		ps.executeUpdate();
		System.out.println("4.SQL 문 실행 요청 성공!");
		
	}

}
