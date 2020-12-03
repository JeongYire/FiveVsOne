package com.fivevsone.cookbook.vo;

import java.io.Serializable;

public class memberVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String memId;
	private String memPwd;
	private String memName;
	private String memNickName;
	private String memEmail;
	private String memGender;
	private String memGrade;
	
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
	public String getMemGrade() {
		return memGrade;
	}
	public void setMemGrade(String memGrade) {
		this.memGrade = memGrade;
	}
	
	public memberVO(String memId, String memPwd, String memName, String memNickName, String memEmail, String memGender,
			String memGrade) {
		super();
		this.memId = memId;
		this.memPwd = memPwd;
		this.memName = memName;
		this.memNickName = memNickName;
		this.memEmail = memEmail;
		this.memGender = memGender;
		this.memGrade = memGrade;
	}
	
	public memberVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "memberVO [memId=" + memId + ", memPwd=" + memPwd + ", memName=" + memName + ", memNickName="
				+ memNickName + ", memEmail=" + memEmail + ", memGender=" + memGender + ", memGrade=" + memGrade + "]";
	}
	
	
	
	
	

}
