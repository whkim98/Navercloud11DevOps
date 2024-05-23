package data.dto;

import java.sql.Timestamp;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Alias("MemberDto")
@Builder
public class MemberDto {
	
	private int num;
	private String name;
	private String addr;
	private String hp;
	private String email;
	private String photo;
	private String birthday;
	private String myid;
	private String passwd;
	private Timestamp gaipday;

}
