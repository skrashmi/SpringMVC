package com.av;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {
	@RequestMapping("/getdata")
	public ModelAndView getData()
	{
		ModelAndView mv= new ModelAndView("MyView.jsp");
		mv.addObject("name","hii ise");
		return mv;
	}
	

}
