package egovframework.busreservation.member.dto;

public class MemberSignupDto {
	
	private String id;
	private String name;
	private String email;
	private String telNo;
	private String passwd;
	private String confirmPasswd;
	private String gbnCd;
	
	public MemberSignupDto() {
		
	}
	
	public MemberSignupDto(String id, String name, String email, String telNo, String passwd, String confirmPasswd, String gbnCd) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.telNo = telNo;
		this.passwd = passwd;
		this.confirmPasswd = confirmPasswd;
		this.gbnCd = gbnCd;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getConfirmPasswd() {
		return confirmPasswd;
	}

	public void setConfirmPasswd(String confirmPasswd) {
		this.confirmPasswd = confirmPasswd;
	}

	public String getGbnCd() {
		return gbnCd;
	}

	public void setGbnCd(String gbnCd) {
		this.gbnCd = gbnCd;
	}
	
}
