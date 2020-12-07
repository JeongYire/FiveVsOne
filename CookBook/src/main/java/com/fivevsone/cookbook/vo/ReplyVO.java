package com.fivevsone.cookbook.vo;

import java.util.Date;

public class ReplyVO {
	private int commentNum;
	private int memGrade;
	private int recipeCode;
	private String comments;
	private Date commentTime;
	private String memId;
	
	public ReplyVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCommentNum() {
		return commentNum;
	}

	public void setCommentNum(int commentNum) {
		this.commentNum = commentNum;
	}

	public int getMemGrade() {
		return memGrade;
	}

	public void setMemGrade(int memGrade) {
		this.memGrade = memGrade;
	}

	public int getRecipeCode() {
		return recipeCode;
	}

	public void setRecipeCode(int recipeCode) {
		this.recipeCode = recipeCode;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getCommentTime() {
		return commentTime;
	}

	public void setCommentTime(Date commentTime) {
		this.commentTime = commentTime;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + commentNum;
		result = prime * result + ((commentTime == null) ? 0 : commentTime.hashCode());
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + memGrade;
		result = prime * result + ((memId == null) ? 0 : memId.hashCode());
		result = prime * result + recipeCode;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReplyVO other = (ReplyVO) obj;
		if (commentNum != other.commentNum)
			return false;
		if (commentTime == null) {
			if (other.commentTime != null)
				return false;
		} else if (!commentTime.equals(other.commentTime))
			return false;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (memGrade != other.memGrade)
			return false;
		if (memId == null) {
			if (other.memId != null)
				return false;
		} else if (!memId.equals(other.memId))
			return false;
		if (recipeCode != other.recipeCode)
			return false;
		return true;
	}

	public ReplyVO(int commentNum, int memGrade, int recipeCode, String comments, Date commentTime, String memId) {
		super();
		this.commentNum = commentNum;
		this.memGrade = memGrade;
		this.recipeCode = recipeCode;
		this.comments = comments;
		this.commentTime = commentTime;
		this.memId = memId;
	}

	@Override
	public String toString() {
		return "ReplyVO [commentNum=" + commentNum + ", memGrade=" + memGrade + ", recipeCode=" + recipeCode
				+ ", comments=" + comments + ", commentTime=" + commentTime + ", memId=" + memId + "]";
	}

	
}
