package data.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import data.dto.StudentDto;
import db.common.MySqlConnect;

public class StudentDao {

	MySqlConnect db = new MySqlConnect();
	
	public void insertStudent(StudentDto dto) {
		String sql = """
				insert into mystudent(name, blood, license, java, spring, html, writeday) values
				(?,?,?,?,?,?,now())
				""";
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getBlood());
			pstmt.setString(3, String.valueOf(dto.getLicense()));
			pstmt.setInt(4, dto.getJava());
			pstmt.setInt(5, dto.getSpring());
			pstmt.setInt(6, dto.getHtml());
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	public List<StudentDto> getAllstudent(){
		List<StudentDto> list = new Vector<StudentDto>();
		String sql = "select * from mystudent order by num";
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				StudentDto dto = new StudentDto();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setBlood(rs.getString("blood"));
				dto.setJava(rs.getInt("java"));
				dto.setSpring(rs.getInt("spring"));
				dto.setHtml(rs.getInt("html"));
				dto.setLicense(rs.getString("license").charAt(0));
				dto.setWriteday(rs.getTimestamp("writeday"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
		return list;
	}
	
	public StudentDto getData(int num) {
		StudentDto dto = new StudentDto();
		String sql = "select * from mystudent where num=?";
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setBlood(rs.getString("blood"));
				dto.setJava(rs.getInt("java"));
				dto.setSpring(rs.getInt("spring"));
				dto.setHtml(rs.getInt("html"));
				dto.setLicense(rs.getString("license").charAt(0));
				dto.setWriteday(rs.getTimestamp("writeday"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
		System.out.println(dto.getLicense());
		return dto;
	}
	
	public void deletetStudent(int num)
	{
		String sql="""
			delete from mystudent where num=?
				""";
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;

		try {
			pstmt=conn.prepareStatement(sql);
			//바인딩
			pstmt.setInt(1, num);
			//실행
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	public void updateStudent(StudentDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = """
				update mystudent set name=?, blood=?, license=?, java=?, spring=?, html=? where num=?
				""";
		conn = db.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getBlood());
			pstmt.setString(3, String.valueOf(dto.getLicense()));
			pstmt.setInt(4, dto.getJava());
			pstmt.setInt(5, dto.getSpring());
			pstmt.setInt(6, dto.getHtml());
			pstmt.setInt(7, dto.getNum());
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
		System.out.println(dto.getNum());
	}
	
}
