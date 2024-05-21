package member.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import member.dto.MemberDto;

@Repository
public class MemberDao {
	
	@Autowired
	private SqlSession session;
	
	private String namespace="member.dao.MemberDao.";
	
	public int getTotalCount(){
		return session.selectOne(namespace+"memberTotalCount");
	}
	
	public int getSearchId(String searchid) {
		return session.selectOne(namespace + "selectIdCheck", searchid);
	}
	
	public void insertMember(MemberDto dto) {
		session.insert(namespace + "insertMember", dto);
	}

}