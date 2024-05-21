package member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import member.dao.MemberDao;

@Service
public class MemberService {

	@Autowired
	private MemberDao memberDao;
	
	public int getTotalCount(){
		return memberDao.getTotalCount();
	}
}