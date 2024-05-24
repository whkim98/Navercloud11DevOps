package data.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import data.dto.MemberDto;

@Mapper
public interface MemberMapperInter {
	@Select("select count(*) from memberdb")
	public int getTotalCount();
	
	@Select("select count(*) from memberdb where myid=#{searchid}")
	public int getIdCheckCount(String searchid);
	
	@Insert("""
			insert into memberdb (name, myid, passwd, addr, hp, email, photo, birthday, gaipday) values(#{name},
			#{myid}, #{passwd}, #{addr}, #{hp}, #{email}, #{photo}, #{birthday}, now())
			""")
	public void insertMember(MemberDto dto);
}