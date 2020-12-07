package com.fivevsone.cookbook.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.fivevsone.cookbook.dao.MemberService;
import com.fivevsone.cookbook.dao.RecipeService;
import com.fivevsone.cookbook.vo.RecipeVO;

public class ChannieTest {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("classpath:root-context.xml");
		RecipeService service = context.getBean("recipeService", RecipeService.class);
		MemberService service2=context.getBean("MemberService", MemberService.class);
		
		RecipeVO vo = new RecipeVO();
		vo.setRecipeCnt(0);
		vo.setRecipeState(1); 
		vo.setRecipeTitle("test"); 
		vo.setRecipeInfo("test");
		vo.setNatCode(10);
		vo.setTastyCode(10);
		vo.setSitCode(10);
		vo.setTypeCode(10); 
		vo.setAmount(5);
		vo.setCookTime(50); 
		vo.setDifficult(5);
		vo.setMaterial("test");
		vo.setCookStep("test");
		vo.setCookTip("test");
		service.insertRecipe(vo);
		System.out.println(vo);
		System.out.println(service.selectAllRecipe());
	}
}
