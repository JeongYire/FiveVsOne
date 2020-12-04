package com.fivevsone.cookbook.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fivevsone.cookbook.inter.RecipeInterface;
import com.fivevsone.cookbook.vo.RecipeVO;

@Service
public class RecipeService implements RecipeInterface {
	@Autowired
	RecipeDAO dao;

	@Override
	public List<RecipeVO> selectAllRecipe() {
		return dao.selectAllRecipe();
	}
}
