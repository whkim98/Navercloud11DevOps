package data.mapper;

import org.apache.ibatis.annotations.Mapper;

import data.dto.GuestDto;
import data.dto.GuestPhotoDto;

@Mapper
public interface GuestMapperInter {
	
	public void insertGuest(GuestDto dto);
	public void insertGuestPhoto(GuestPhotoDto dto);

}
