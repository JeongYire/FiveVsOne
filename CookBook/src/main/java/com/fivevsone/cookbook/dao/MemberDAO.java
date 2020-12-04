package com.fivevsone.cookbook.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fivevsone.cookbook.inter.MemberInterface;
import com.fivevsone.cookbook.vo.MemberVO;

@Repository
public class MemberDAO implements MemberInterface {
	
	@Autowired
	SqlSession sqlSession;

	@Override
	public void insertMember(MemberVO vo) {
		
		sqlSession.insert("memberNS.insertMember",vo);
		
	}

	@Override
	public List<MemberVO> selectAllMember() {
	
		return sqlSession.selectList("memberNS.selectAllMember");
	}

	@Override
	public MemberVO selectOneMember(int memCode) {
		
		return sqlSession.selectOne("memberNS.selectOneMember",memCode);
	}
	

	
	
	
	
	

}
