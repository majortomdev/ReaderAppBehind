package com.jkdev.glassthunk.readerApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
	@RequestMapping("/")
	@ResponseBody
	public ModelAndView index () {
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("index.html");
	    return modelAndView;
	}
	
	@RequestMapping("/politics")
	@ResponseBody
	public ModelAndView politics () {
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("poly.html");
	    return modelAndView;
	}
	

}
