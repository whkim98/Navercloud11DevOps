package data.mapper;

import org.apache.ibatis.annotations.Mapper;

import data.dto.GuestDto;

@Mapper
public interface GuestMapperInter {
	
	public void insertGuest(GuestDto dto);

}
