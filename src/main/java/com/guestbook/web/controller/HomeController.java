package com.guestbook.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/index")
	public String index() {
		System.out.println("======================");
		System.out.println("index 호출!!");
		System.out.println("======================");
		
		return "index";
	}
	
//	@RequestMapping("/index")
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("/WEB-INF/view/index.jsp");
//		return mav;
//	}

}
