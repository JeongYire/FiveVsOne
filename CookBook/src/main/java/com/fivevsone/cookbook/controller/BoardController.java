package com.fivevsone.cookbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.fivevsone.cookbook.dao.MemberService;
import com.fivevsone.cookbook.dao.RecipeService;


public class BoardController {
	// BoardController 는 정이레가 임시로 붙인 이름입니다 컨트롤러를 담당하시는분이 이름을 정하세요
	
	
	MemberService memberService;
	RecipeService recipeService;

}
