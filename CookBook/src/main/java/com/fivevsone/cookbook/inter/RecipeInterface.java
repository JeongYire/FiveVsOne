package com.fivevsone.cookbook.inter;

import java.util.List;

import com.fivevsone.cookbook.vo.RecipeVO;

public interface RecipeInterface {
	public List<RecipeVO> selectAllRecipe(); 
}
