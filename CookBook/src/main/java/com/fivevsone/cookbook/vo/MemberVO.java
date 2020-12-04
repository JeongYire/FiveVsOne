package com.fivevsone.cookbook.vo;

import java.io.Serializable;
import java.util.Date;

public class MemberVO implements Serializable {
private static final long serialVersionUID = 1L;

private int memCode;
private String memId;
private String memPwd;
private String memName;
private String memNickName;
private String memEmail;
private String memGender;
private int memGrade;
private Date regDate;
private Date conDate;
private String bookMark;
private String memIntroduce;
private int memState;

// 흥미 
private String sitCode;
private String natCode;
//

public int getMemCode() {
	return memCode;
}
public void setMemCode(int memCode) {
	this.memCode = memCode;
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
public int getMemGrade() {
	return memGrade;
}
public void setMemGrade(int memGrade) {
	this.memGrade = memGrade;
}
public Date getRegDate() {
	return regDate;
}
public void setRegDate(Date regDate) {
	this.regDate = regDate;
}
public Date getConDate() {
	return conDate;
}
public void setConDate(Date conDate) {
	this.conDate = conDate;
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
public int getMemState() {
	return memState;
}
public void setMemState(int memState) {
	this.memState = memState;
}
public String getSitCode() {
	return sitCode;
}
public void setSitCode(String sitCode) {
	this.sitCode = sitCode;
}
public String getNatCode() {
	return natCode;
}
public void setNatCode(String natCode) {
	this.natCode = natCode;
}

@Override
public String toString() {
	return "MemberVO [memCode=" + memCode + ", memId=" + memId + ", memPwd=" + memPwd + ", memName=" + memName
			+ ", memNickName=" + memNickName + ", memEmail=" + memEmail + ", memGender=" + memGender + ", memGrade="
			+ memGrade + ", regDate=" + regDate + ", conDate=" + conDate + ", bookMark=" + bookMark + ", memIntroduce="
			+ memIntroduce + ", memState=" + memState + ", sitCode=" + sitCode + ", natCode=" + natCode + "]";
}

public MemberVO() {
	super();
	// TODO Auto-generated constructor stub
}




	
	
}