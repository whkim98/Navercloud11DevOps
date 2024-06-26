package DAY0405;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import DAY0404DB.*;

public class Ex9SawonUpdate {
	static final String MYSQL_DRIVER="com.mysql.cj.jdbc.Driver";
	static final String MYSQL_URL="jdbc:mysql://localhost:3306/bit801?serverTimezone=Asia/Seoul";
	static final String USERNAME="root";
	static final String PASSWORD="dnehd1008@";	
	
	public Ex9SawonUpdate() {
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
		
		String sql="update sawon set score="+updateScore+",buseo='"+updateBuseo+"' where name='"+updateName+"'";
		System.out.println(sql);
		
		Connection conn=null;
		Statement stmt=null;
		
		try {
			conn=DriverManager.getConnection(MYSQL_URL, USERNAME, PASSWORD);
			stmt=conn.createStatement();
			int n=stmt.executeUpdate(sql);
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
				stmt.close();
				conn.close();
			} catch (SQLException|NullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex9SawonUpdate ex9=new Ex9SawonUpdate();
		ex9.updateSawon();
	}

}