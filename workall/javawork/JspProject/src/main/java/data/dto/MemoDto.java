package data.dto;

import java.sql.Timestamp;

public class MemoDto {
	
	private int num;
	private String uploadphoto;
	private String title;
	private String content;
	private Timestamp writeday;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getUploadphoto() {
		return uploadphoto;
	}
	public void setUploadphoto(String uploadphoto) {
		this.uploadphoto = uploadphoto;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getWriteday() {
		return writeday;
	}
	public void setWriteday(Timestamp writeday) {
		this.writeday = writeday;
	}

}
