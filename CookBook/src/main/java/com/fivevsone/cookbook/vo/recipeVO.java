package com.fivevsone.cookbook.vo;

import java.util.Date;

public class recipeVO {
	private int recipeCode;
	private int natCode;
	private String natName;
	private int sitCode;
	private String sitName;
	private int amount;
	private int cookTime;
	private int difficult;
	private String material;
	private String cookStep;
	private String cookTip;
	private int typeCode;
	private String typeName;
	private Date writeTime;
	
	
	public recipeVO() {
		super();
	}


	public int getRecipeCode() {
		return recipeCode;
	}


	public void setRecipeCode(int recipeCode) {
		this.recipeCode = recipeCode;
	}


	public int getNatCode() {
		return natCode;
	}


	public void setNatCode(int natCode) {
		this.natCode = natCode;
	}


	public String getNatName() {
		return natName;
	}


	public void setNatName(String natName) {
		this.natName = natName;
	}


	public int getSitCode() {
		return sitCode;
	}


	public void setSitCode(int sitCode) {
		this.sitCode = sitCode;
	}


	public String getSitName() {
		return sitName;
	}


	public void setSitName(String sitName) {
		this.sitName = sitName;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public int getCookTime() {
		return cookTime;
	}


	public void setCookTime(int cookTime) {
		this.cookTime = cookTime;
	}


	public int getDifficult() {
		return difficult;
	}


	public void setDifficult(int difficult) {
		this.difficult = difficult;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	public String getCookStep() {
		return cookStep;
	}


	public void setCookStep(String cookStep) {
		this.cookStep = cookStep;
	}


	public String getCookTip() {
		return cookTip;
	}


	public void setCookTip(String cookTip) {
		this.cookTip = cookTip;
	}


	public int getTypeCode() {
		return typeCode;
	}


	public void setTypeCode(int typeCode) {
		this.typeCode = typeCode;
	}


	public String getTypeName() {
		return typeName;
	}


	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}


	public Date getWriteTime() {
		return writeTime;
	}


	public void setWriteTime(Date writeTime) {
		this.writeTime = writeTime;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + ((cookStep == null) ? 0 : cookStep.hashCode());
		result = prime * result + cookTime;
		result = prime * result + ((cookTip == null) ? 0 : cookTip.hashCode());
		result = prime * result + difficult;
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + natCode;
		result = prime * result + ((natName == null) ? 0 : natName.hashCode());
		result = prime * result + recipeCode;
		result = prime * result + sitCode;
		result = prime * result + ((sitName == null) ? 0 : sitName.hashCode());
		result = prime * result + typeCode;
		result = prime * result + ((typeName == null) ? 0 : typeName.hashCode());
		result = prime * result + ((writeTime == null) ? 0 : writeTime.hashCode());
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
		recipeVO other = (recipeVO) obj;
		if (amount != other.amount)
			return false;
		if (cookStep == null) {
			if (other.cookStep != null)
				return false;
		} else if (!cookStep.equals(other.cookStep))
			return false;
		if (cookTime != other.cookTime)
			return false;
		if (cookTip == null) {
			if (other.cookTip != null)
				return false;
		} else if (!cookTip.equals(other.cookTip))
			return false;
		if (difficult != other.difficult)
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (natCode != other.natCode)
			return false;
		if (natName == null) {
			if (other.natName != null)
				return false;
		} else if (!natName.equals(other.natName))
			return false;
		if (recipeCode != other.recipeCode)
			return false;
		if (sitCode != other.sitCode)
			return false;
		if (sitName == null) {
			if (other.sitName != null)
				return false;
		} else if (!sitName.equals(other.sitName))
			return false;
		if (typeCode != other.typeCode)
			return false;
		if (typeName == null) {
			if (other.typeName != null)
				return false;
		} else if (!typeName.equals(other.typeName))
			return false;
		if (writeTime == null) {
			if (other.writeTime != null)
				return false;
		} else if (!writeTime.equals(other.writeTime))
			return false;
		return true;
	}


	public recipeVO(int recipeCode, int natCode, String natName, int sitCode, String sitName, int amount, int cookTime,
			int difficult, String material, String cookStep, String cookTip, int typeCode, String typeName,
			Date writeTime) {
		super();
		this.recipeCode = recipeCode;
		this.natCode = natCode;
		this.natName = natName;
		this.sitCode = sitCode;
		this.sitName = sitName;
		this.amount = amount;
		this.cookTime = cookTime;
		this.difficult = difficult;
		this.material = material;
		this.cookStep = cookStep;
		this.cookTip = cookTip;
		this.typeCode = typeCode;
		this.typeName = typeName;
		this.writeTime = writeTime;
	}


	@Override
	public String toString() {
		return "recipeVO [recipeCode=" + recipeCode + ", natCode=" + natCode + ", natName=" + natName + ", sitCode="
				+ sitCode + ", sitName=" + sitName + ", amount=" + amount + ", cookTime=" + cookTime + ", difficult="
				+ difficult + ", material=" + material + ", cookStep=" + cookStep + ", cookTip=" + cookTip
				+ ", typeCode=" + typeCode + ", typeName=" + typeName + ", writeTime=" + writeTime + "]";
	}


}
