package com.fivevsone.cookbook.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fivevsone.cookbook.inter.MemberInterface;
import com.fivevsone.cookbook.vo.memberVO;

@Repository
public class MemberDAO implements MemberInterface {
	
	@Autowired
	SqlSession sqlSession;

	@Override
	public void insertMember(memberVO vo) {
		
		sqlSession.insert("memberNS.insertMember");
		
	}
	

	
	
	
	
	

}
