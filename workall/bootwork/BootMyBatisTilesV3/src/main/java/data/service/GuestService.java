package data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.dto.GuestDto;
import data.mapper.GuestMapperInter;

@Service
public class GuestService {
	
	@Autowired
	private GuestMapperInter guestMapper;
	
	public void insertGuest(GuestDto dto) {
		guestMapper.insertGuest(dto);
	}

}
