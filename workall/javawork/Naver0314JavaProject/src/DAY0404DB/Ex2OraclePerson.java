package DAY0404DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex2OraclePerson {
	
	static final String ORACLE_DRIVER = "oracle.jdbc.OracleDriver";
	static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static final String user = "c##TAA";
	static final String password = "taa";
	
	public Ex2OraclePerson() {
	
		try {
			Class.forName(ORACLE_DRIVER);
			System.out.println("로딩 성공");
		} catch (ClassNotFoundException e) {
			System.err.println("로딩 실패");
			e.printStackTrace();
		}
	
	}
	
	static public void showTitle() {
		System.out.println("=".repeat(40));
		System.out.println("시퀀스\t이름\t혈액형\t나이\t입사일");
		System.out.println("=".repeat(40));
	}
	
	public void writesSawon() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("성공");
		} catch (SQLException e) {
			System.out.println("실패");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Ex2OraclePerson ex2 = new Ex2OraclePerson();
		showTitle();
		ex2.writesSawon();
		
	}

}
