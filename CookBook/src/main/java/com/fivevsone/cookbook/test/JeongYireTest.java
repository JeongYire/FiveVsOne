package com.fivevsone.cookbook.test;


import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.fivevsone.cookbook.dao.MemberService;
import com.fivevsone.cookbook.dao.RecipeService;
import com.fivevsone.cookbook.vo.MemberVO;

public class JeongYireTest {
	

	
	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("classpath:root-context.xml");
		System.out.println("1차 : context 실행 = " + context);
		DataSource dataSource = context.getBean("dataSource",DataSource.class);
		System.out.println("2차 : dataSource 정상 연동 확인 = " + dataSource);
		SqlSessionTemplate sqlTemplate = context.getBean("sqlSession",SqlSessionTemplate.class);
		System.out.println("3차 : sqlSession 객체 주입 확인 " + sqlTemplate);
		MemberService service = context.getBean("MemberService",MemberService.class);
		System.out.println("4차 : dao 객체 주입 확인 " + service );

		
		   MemberVO vo = new MemberVO();
		   
		 
		      System.out.println(vo);
		   
		
		   
		   System.out.println(service.selectAllMember());
		   
		   System.out.println("memCode가 0인사람은 ? = " + service.selectOneMember(1));
	   
   
	
		
	}
}
