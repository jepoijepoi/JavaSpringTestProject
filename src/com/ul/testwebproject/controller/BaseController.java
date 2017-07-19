package com.ul.testwebproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
	
public class BaseController {

	@RequestMapping(value = "/mainPage", method = RequestMethod.GET)
	public ModelAndView index() {
		return new ModelAndView("main.page");
	}
}
