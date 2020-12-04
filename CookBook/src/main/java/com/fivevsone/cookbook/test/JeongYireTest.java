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
		   
		 //  vo.setMemId("yire");
		 //  vo.setMemPwd("yire1234");
		 //  vo.setMemName("정이레");
		 //  vo.setMemNickName("정이레몬");
		 //  vo.setMemEmail("wotjd0611@gmail.com");
		 //  vo.setMemGender("남자");
		  // vo.setBookMark("14,72,66,41,45,6");
		 //  vo.setMemIntroduce("정이레입니다.");
		   //vo.setSitCode("1,2,3,4,11");
		  // vo.setNatCode("11,44,23,55");
		   
	//	   System.out.println(vo);
		   
		//   service.insertMember(vo);
		   
		   System.out.println(service.selectAllMember());
		   
		   System.out.println("memCode가 0인사람은 ? = " + service.selectOneMember(0));
	   
   
	
		
	}
}
