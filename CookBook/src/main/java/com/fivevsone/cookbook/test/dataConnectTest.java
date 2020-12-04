package com.fivevsone.cookbook.test;


import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.fivevsone.cookbook.dao.MemberService;
import com.fivevsone.cookbook.dao.RecipeService;

public class dataConnectTest {
	

	
	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("classpath:root-context.xml");
		System.out.println("1차 : context 실행 = " + context);
		DataSource dataSource = context.getBean("dataSource",DataSource.class);
		System.out.println("2차 : dataSource 정상 연동 확인 = " + dataSource);
		SqlSessionTemplate sqlTemplate = context.getBean("sqlSession",SqlSessionTemplate.class);
		System.out.println("3차 : sqlSession 객체 주입 확인 " + sqlTemplate);
		MemberService service = context.getBean("MemberService",MemberService.class);
		System.out.println("4차 : dao 객체 주입 확인 " + service );
		RecipeService reservice = context.getBean("recipeService", RecipeService.class);
//	   MemberVO vo = new MemberVO();
//	   vo.setMemId("5vs1");
//	   vo.setMemPwd("5vs1234");
//	   vo.setMemName("오대일");
//	   vo.setMemNickName("대일이");
//	   vo.setMemEmail("dail@gmail.com");
//	   vo.setMemGender("남자");
//	   vo.setBookMark("14,72,66,41,45,6");
//	   vo.setMemIntroduce("새로운 회원");
//	   
//	   System.out.println(vo);
//	   
//	   service.insertMember(vo);
//	   System.out.println("성공!");
	   
		
		System.out.println(service.selectAllMember());

		System.out.println("성공!");
		
		System.out.println(reservice.selectAllRecipe());
		System.out.println("성공");
		
	}
}
