package data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.mapper.MemberMapperInter;

@Service
public class MemberService {
	@Autowired
	private MemberMapperInter memInter;
	
	public int getTotalCount()
	{
		return memInter.getTotalCount();
	}
}