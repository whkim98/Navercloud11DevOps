package data.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import data.dto.MemoDto;
import db.common.MySqlConnect;

public class MemoDao {
	
	MySqlConnect db = new MySqlConnect();
	
	public void insertMemo(MemoDto dto) {
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		String sql = "insert into mymemo(uploadphoto, title, content, writeday) values(?, ?, ?, now())";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getUploadphoto());
			pstmt.setString(2, dto.getTitle());
			pstmt.setString(3, dto.getContent());
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	public List<MemoDto> getAllMemo(){
		List<MemoDto> list = new Vector<MemoDto>();
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from mymemo order by num desc";
		try {
			pstmt=conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MemoDto dto = new MemoDto();
				dto.setNum(rs.getInt("num"));
				dto.setUploadphoto(rs.getString("uploadphoto"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
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

}
