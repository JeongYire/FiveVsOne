package com.fivevsone.cookbook.vo;

import java.io.Serializable;
import java.util.Date;

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
	private int memState;
	private Date signUpDate;
	private String bookMark;
	private String memIntroduce;
	
	
	
	public int getMemState() {
		return memState;
	}
	public void setMemState(int memState) {
		this.memState = memState;
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
	public Date getSignUpDate() {
		return signUpDate;
	}
	public void setSignUpDate(Date signUpDate) {
		this.signUpDate = signUpDate;
	}
	public String getBookMark() {
		return bookMark;
	}
	public void setBookMark(String bookMark) {
		this.bookMark = bookMark;
	}
	public String getMemIntroduce() {
		return memIntroduce;
	}
	public void setMemIntroduce(String memIntroduce) {
		this.memIntroduce = memIntroduce;
	}
	public memberVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public memberVO(String memId, String memPwd, String memName, String memNickName, String memEmail, String memGender,
			String memGrade, Date signUpDate, String bookMark, String memIntroduce) {
		super();
		this.memId = memId;
		this.memPwd = memPwd;
		this.memName = memName;
		this.memNickName = memNickName;
		this.memEmail = memEmail;
		this.memGender = memGender;
		this.memGrade = memGrade;
		this.signUpDate = signUpDate;
		this.bookMark = bookMark;
		this.memIntroduce = memIntroduce;
	}
	@Override
	public String toString() {
		return "memberVO [memId=" + memId + ", memPwd=" + memPwd + ", memName=" + memName + ", memNickName="
				+ memNickName + ", memEmail=" + memEmail + ", memGender=" + memGender + ", memGrade=" + memGrade
				+ ", signUpDate=" + signUpDate + ", bookMark=" + bookMark + ", memIntroduce=" + memIntroduce + "]";
	}

	
}