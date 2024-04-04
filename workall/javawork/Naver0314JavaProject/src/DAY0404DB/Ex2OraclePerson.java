package DAY0404DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select pnum, pname, upper(pblood) pblood, page, to_char(ipsaday, 'yyyy-mm-dd') ipsaday from person";
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("성공");
			showTitle();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int pnum = rs.getInt("pnum");
				String pname = rs.getString("pname");
				String pblood = rs.getString("pblood");
				int page = rs.getInt("page");
				String ipsaday = rs.getString("ipsaday");
				System.out.println(pnum + "\t" + pname + "\t" + pblood + "\t" + page + "\t" + ipsaday);
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
		
		Ex2OraclePerson ex2 = new Ex2OraclePerson();
		ex2.writesSawon();
		
	}

}
