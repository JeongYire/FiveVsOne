package com.fivevsone.cookbook;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		System.out.println("you can see this ? - > 이 부분은 김채연이 한글로 작성하였습니다.");
		
		System.out.println("it is korean -> 정이레 입니다 ");
		
		System.out.println("창훈입니다.");
		
		System.out.println("이현아");
		
		System.out.println("김넷쥬");
		return "home";
	}
	
}
