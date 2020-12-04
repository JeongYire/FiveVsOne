package com.fivevsone.cookbook.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fivevsone.cookbook.vo.RecipeVO;

@Repository
public class RecipeDAO {
	@Autowired
	SqlSession session;
	public List<RecipeVO> selectAllRecipe(){
		return session.selectList("recipeNS.selectAllRecipe");
	}
}
