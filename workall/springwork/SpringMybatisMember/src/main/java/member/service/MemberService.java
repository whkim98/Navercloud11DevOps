package member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import member.dao.MemberDao;
import member.dto.MemberDto;

@Service
public class MemberService {

	@Autowired
	private MemberDao memberDao;
	
	public int getTotalCount(){
		return memberDao.getTotalCount();
	}
	
	public int getSearchId(String searchid) {
		return memberDao.getSearchId(searchid);
	}
	
	public void insertMember(MemberDto dto) {
		memberDao.insertMember(dto);
	}
	
}