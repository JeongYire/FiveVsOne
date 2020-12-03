package com.fivevsone.cookbook.test;


import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.fivevsone.cookbook.vo.recipeVO;

public class dataConnectTest {
	

	
	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("classpath:root-context.xml");
		System.out.println("1차 : context 실행 = " + context);
		DataSource dataSource = context.getBean("dataSource",DataSource.class);
		System.out.println("2차 : dataSource 정상 연동 확인 = " + dataSource);
		SqlSessionTemplate sqlTemplate = context.getBean("sqlSession",SqlSessionTemplate.class);
		System.out.println("3차 : sqlSessionTemplate 정상 주입 확인 :" + sqlTemplate);
		
		
		// 이후 DAO 객체주입 확인할것
		
		
	}
	
	

}
