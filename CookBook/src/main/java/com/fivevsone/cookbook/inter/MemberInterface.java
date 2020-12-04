package com.fivevsone.cookbook.inter;

import java.util.List;

import com.fivevsone.cookbook.vo.MemberVO;



public interface MemberInterface {
	
	public void insertMember(MemberVO vo);
	public List<MemberVO> selectAllMember();
	public MemberVO selectOneMember(int memCode);

}
