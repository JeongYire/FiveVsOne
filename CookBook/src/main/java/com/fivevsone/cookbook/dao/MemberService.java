package com.fivevsone.cookbook.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fivevsone.cookbook.inter.MemberInterface;
import com.fivevsone.cookbook.vo.MemberVO;

@Service("MemberService")
public class MemberService implements MemberInterface {
	
	@Autowired
	MemberDAO dao;
	
	
	@Override
	public void insertMember(MemberVO vo) {
		
		dao.insertMember(vo);
		
	}


	@Override
	public List<MemberVO> selectAllMember() {
		return dao.selectAllMember();
	}


	@Override
	public MemberVO selectOneMember(int memCode) {
		
		return dao.selectOneMember(memCode);
	}
	
	
	
	

}
