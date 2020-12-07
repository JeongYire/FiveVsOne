package com.fivevsone.cookbook.vo;

public class MemberJoin {
	private String memId;
	private String memPwd;
	private String checkmemPwd;
	private String memName;
	private String memNickName;
	private String memEmail;
	private String memGender;
	
	//비밀번호체크
	public boolean checkPwd() {
		return memPwd.equals(checkmemPwd);
	}
	
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemPwd() {
		return memPwd;
	}
	public void setMemPwd(String memPwd) {
		this.memPwd = memPwd;
	}
	public String getCheckmemPwd() {
		return checkmemPwd;
	}
	public void setCheckmemPwd(String checkmemPwd) {
		this.checkmemPwd = checkmemPwd;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public String getMemNickName() {
		return memNickName;
	}
	public void setMemNickName(String memNickName) {
		this.memNickName = memNickName;
	}
	public String getMemEmail() {
		return memEmail;
	}
	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}
	public String getMemGender() {
		return memGender;
	}
	public void setMemGender(String memGender) {
		this.memGender = memGender;
	}
	
	
}
