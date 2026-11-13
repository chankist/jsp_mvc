package dto;

import java.sql.Timestamp;

public class MemberDto {

	private String userid;
	private String userpw;
	private String username;
	private String uemail;
	private Timestamp userdate;
	
	public MemberDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberDto(String userid, String userpw, String username, String uemail, Timestamp userdate) {
		super();
		this.userid = userid;
		this.userpw = userpw;
		this.username = username;
		this.uemail = uemail;
		this.userdate = userdate;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpw() {
		return userpw;
	}

	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public Timestamp getUserdate() {
		return userdate;
	}

	public void setUserdate(Timestamp userdate) {
		this.userdate = userdate;
	}
	
	
	
}
