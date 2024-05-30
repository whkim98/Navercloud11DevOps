package data.dto;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Alias("GuestPhotoDto")
public class GuestPhotoDto {
	
	private int photoidx;
	private int guestidx;
	private String photoname;

}
