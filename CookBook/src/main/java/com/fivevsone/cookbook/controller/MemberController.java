package com.fivevsone.cookbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fivevsone.cookbook.dao.MemberService;
import com.fivevsone.cookbook.vo.MemberVO;

@Controller
@RequestMapping(value="/member/*")
public class MemberController {

	@Autowired
	MemberService service;
	
	//회원가입-버튼클릭
	@RequestMapping(value="/step1")
	public String step1() {
		return "/member/step1";
	}
	
	//회원가입-약관동의
	@RequestMapping(value="/step2")
	public ModelAndView step2(@RequestParam(value="agree", defaultValue="false") Boolean agree) {
		if(!agree) { //비동의
			ModelAndView mav= new ModelAndView("member/step2");
			return mav;
		}
		ModelAndView mav= new ModelAndView("member/step3"); //동의
		mav.addObject("memberVO", new MemberVO());
		return mav;
	}
	
	//회원가입-중복체크하기
	@RequestMapping(value="/step3")
	public String insertMember(MemberVO vo) {
		return "";
	}
}
