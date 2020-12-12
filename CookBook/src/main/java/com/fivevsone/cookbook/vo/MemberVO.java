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
private String memIntroduce;
private int memAge;
private String memEmail;
private String memAddress;
private String memGender;
private int memGrade;
private int memState;
private String bookmark;
private Date regDate;
private Date conDate;
private int sitCode;
private int natCode;
private int tastyCode;
private int ageCode;
private int typeCode;
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
public String getMemIntroduce() {
	return memIntroduce;
}
public void setMemIntroduce(String memIntroduce) {
	this.memIntroduce = memIntroduce;
}
public int getMemAge() {
	return memAge;
}
public void setMemAge(int memAge) {
	this.memAge = memAge;
}
public String getMemEmail() {
	return memEmail;
}
public void setMemEmail(String memEmail) {
	this.memEmail = memEmail;
}
public String getMemAddress() {
	return memAddress;
}
public void setMemAddress(String memAddress) {
	this.memAddress = memAddress;
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
public int getMemState() {
	return memState;
}
public void setMemState(int memState) {
	this.memState = memState;
}
public String getBookmark() {
	return bookmark;
}
public void setBookmark(String bookmark) {
	this.bookmark = bookmark;
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
public int getSitCode() {
	return sitCode;
}
public void setSitCode(int sitCode) {
	this.sitCode = sitCode;
}
public int getNatCode() {
	return natCode;
}
public void setNatCode(int natCode) {
	this.natCode = natCode;
}
public int getTastyCode() {
	return tastyCode;
}
public void setTastyCode(int tastyCode) {
	this.tastyCode = tastyCode;
}
public int getAgeCode() {
	return ageCode;
}
public void setAgeCode(int ageCode) {
	this.ageCode = ageCode;
}
public int getTypeCode() {
	return typeCode;
}
public void setTypeCode(int typeCode) {
	this.typeCode = typeCode;
}
@Override
public String toString() {
	return "MemberVO [memCode=" + memCode + ", memId=" + memId + ", memPwd=" + memPwd + ", memName=" + memName
			+ ", memNickName=" + memNickName + ", memIntroduce=" + memIntroduce + ", memAge=" + memAge + ", memEmail="
			+ memEmail + ", memAddress=" + memAddress + ", memGender=" + memGender + ", memGrade=" + memGrade
			+ ", memState=" + memState + ", bookmark=" + bookmark + ", regDate=" + regDate + ", conDate=" + conDate
			+ ", sitCode=" + sitCode + ", natCode=" + natCode + ", tastyCode=" + tastyCode + ", ageCode=" + ageCode
			+ ", typeCode=" + typeCode + "]";
}
public MemberVO(int memCode, String memId, String memPwd, String memName, String memNickName, String memIntroduce,
		int memAge, String memEmail, String memAddress, String memGender, int memGrade, int memState, String bookmark,
		Date regDate, Date conDate, int sitCode, int natCode, int tastyCode, int ageCode, int typeCode) {
	super();
	this.memCode = memCode;
	this.memId = memId;
	this.memPwd = memPwd;
	this.memName = memName;
	this.memNickName = memNickName;
	this.memIntroduce = memIntroduce;
	this.memAge = memAge;
	this.memEmail = memEmail;
	this.memAddress = memAddress;
	this.memGender = memGender;
	this.memGrade = memGrade;
	this.memState = memState;
	this.bookmark = bookmark;
	this.regDate = regDate;
	this.conDate = conDate;
	this.sitCode = sitCode;
	this.natCode = natCode;
	this.tastyCode = tastyCode;
	this.ageCode = ageCode;
	this.typeCode = typeCode;
}
public MemberVO() {
	super();
	// TODO Auto-generated constructor stub
}





}