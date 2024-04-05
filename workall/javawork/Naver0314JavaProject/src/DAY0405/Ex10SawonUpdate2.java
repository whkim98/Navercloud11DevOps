package DAY0405;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import DAY0404DB.*;

public class Ex10SawonUpdate2 {
	static final String MYSQL_DRIVER="com.mysql.cj.jdbc.Driver";
	static final String MYSQL_URL="jdbc:mysql://localhost:3306/bit801?serverTimezone=Asia/Seoul";
	static final String USERNAME="root";
	static final String PASSWORD="dnehd1008@";	
	
	public Ex10SawonUpdate2() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName(MYSQL_DRIVER);
			//System.out.println("Mysql8 드라이버 성공!");
		} catch (ClassNotFoundException e) {
			System.out.println("Mysql8 드라이버 오류:"+e.getMessage());
		}
	}
	
	public void updateSawon()
	{
		Ex1MysqlSawon sawon=new Ex1MysqlSawon();
		sawon.writesSawon();
		System.out.println("-".repeat(40));
		
		Scanner sc=new Scanner(System.in);
		String updateName,updateBuseo;
		int updateScore;
		
		System.out.println("수정할 사람의 이름은?");
		updateName=sc.nextLine();
		
		System.out.println("수정할 점수는?");
		updateScore=Integer.parseInt(sc.nextLine());
		
		System.out.println("수정할 부서명은?");
		updateBuseo=sc.nextLine();
		
		String sql="update sawon set score=?,buseo=? where name=?";
		System.out.println(sql);
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		try {
			conn=DriverManager.getConnection(MYSQL_URL, USERNAME, PASSWORD);
			pstmt=conn.prepareStatement(sql);
			//? 에 값 바인딩
			pstmt.setInt(1, updateScore);
			pstmt.setString(2, updateBuseo);
			pstmt.setString(3, updateName);
			
			int n=pstmt.executeUpdate();
			
			if(n==0)
				System.out.println(updateName+" 님이 존재하지 않습니다");
			else {
				System.out.println(updateName+" 님의 정보가 수정되었습니다");
				//수정됐는지 확인하기
				sawon.writesSawon();
			}			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException|NullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex10SawonUpdate2 ex9=new Ex10SawonUpdate2();
		ex9.updateSawon();
	}

}