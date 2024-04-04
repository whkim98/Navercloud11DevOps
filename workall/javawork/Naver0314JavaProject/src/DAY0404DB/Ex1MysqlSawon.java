package DAY0404DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex1MysqlSawon {
	static final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String url = "jdbc:mysql://localhost:3306/bit801?serverTimezone=Asia/Seoul";
	static final String user = "root";
	static final String password = "dnehd1008@";

		public Ex1MysqlSawon() {
			try {
				Class.forName(MYSQL_DRIVER);
				System.out.println("로딩 성공");
			} catch (ClassNotFoundException e) {
				System.err.println("로딩 실패");
				e.printStackTrace();
			}	
			
		}
		
		static public void showTitle() {
			System.out.println("=".repeat(40));
			System.out.println("시퀀스\t이름\t점수\t성별\t부서");
			System.out.println("=".repeat(40));
		}
		
		public void writesSawon() {
			Connection conn = null;
			Statement stmt = null;
			ResultSet rs = null;
			String sql = "select * from sawon order by num";
			
			try {
				conn = DriverManager.getConnection(url, user, password);
				System.out.println("성공");
				showTitle();
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
//					int num = rs.getInt(1);
//					String name = rs.getString(2);
//					int score = rs.getInt(3);
//					String gender = rs.getString(4);
//					String buseo = rs.getString(5);
					
					int num = rs.getInt("num");
					String name = rs.getString("name");
					int score = rs.getInt("score");
					String gender = rs.getString("gender");
					String buseo = rs.getString("buseo");
					
					System.out.println(num + "\t" + name + "\t" + score + "\t" + gender + "\t" +  buseo);
				}
			} catch (SQLException e) {
				System.out.println("실패");
				e.printStackTrace();
			}finally {
				try {
					conn.close();
					rs.close();
					stmt.close();
				} catch (SQLException|NullPointerException e) {
					e.printStackTrace();
				}
			}
		}
		
		public static void main(String[] args) {
		
			Ex1MysqlSawon ex1 = new Ex1MysqlSawon();
			ex1.writesSawon();
		
		}
}
