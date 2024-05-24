package data.mapper;

import java.util.List;

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
	
	@Select("select * from memberdb order by num desc")
	public List<MemberDto> getAllMembers();
	
	@Select("select * from memberdb where num=#{num}")
	public MemberDto getData(int num);
}