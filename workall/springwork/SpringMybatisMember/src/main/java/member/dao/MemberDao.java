package member.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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

}