package com.fivevsone.cookbook.vo;

import java.io.Serializable;
import java.util.Date;

public class RecipeVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
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
	private int recipeCnt;
	private int recipeStar;
	private int tastyCode;
	private int recipeState;
	private String tastyName;
	
	
	
	
	
	public int getRecipeState() {
		return recipeState;
	}
	public void setRecipeState(int recipeState) {
		this.recipeState = recipeState;
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
	public int getRecipeCnt() {
		return recipeCnt;
	}
	public void setRecipeCnt(int recipeCnt) {
		this.recipeCnt = recipeCnt;
	}
	public int getRecipeStar() {
		return recipeStar;
	}
	public void setRecipeStar(int recipeStar) {
		this.recipeStar = recipeStar;
	}
	public int getTastyCode() {
		return tastyCode;
	}
	public void setTastyCode(int tastyCode) {
		this.tastyCode = tastyCode;
	}
	public String getTastyName() {
		return tastyName;
	}
	public void setTastyName(String tastyName) {
		this.tastyName = tastyName;
	}
	public RecipeVO(int recipeCode, int natCode, String natName, int sitCode, String sitName, int amount, int cookTime,
			int difficult, String material, String cookStep, String cookTip, int typeCode, String typeName,
			Date writeTime, int recipeCnt, int recipeStar, int tastyCode, String tastyName) {
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
		this.recipeCnt = recipeCnt;
		this.recipeStar = recipeStar;
		this.tastyCode = tastyCode;
		this.tastyName = tastyName;
	}
	
	public RecipeVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "recipeVO [recipeCode=" + recipeCode + ", natCode=" + natCode + ", natName=" + natName + ", sitCode="
				+ sitCode + ", sitName=" + sitName + ", amount=" + amount + ", cookTime=" + cookTime + ", difficult="
				+ difficult + ", material=" + material + ", cookStep=" + cookStep + ", cookTip=" + cookTip
				+ ", typeCode=" + typeCode + ", typeName=" + typeName + ", writeTime=" + writeTime + ", recipeCnt="
				+ recipeCnt + ", recipeStar=" + recipeStar + ", tastyCode=" + tastyCode + ", tastyName=" + tastyName
				+ "]";
	}
	
	
	
	
	
	


}
