package com.org.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.org.bean.Student;

@Controller
@RequestMapping(path = "/standard")
public class StandardController {
	private static Logger log = LoggerFactory
			.getLogger(StandardController.class.getSimpleName());
	
	@RequestMapping(path="/stud",method=RequestMethod.GET)
	public ModelAndView standard()
	{
//		Map map=new HashMap<>();
//		map.put("headerName","Student");
		return new ModelAndView("stud","studentref",new Student());
	}
	
	@RequestMapping(path = "/stud", method = RequestMethod.POST)
	public ModelAndView createStandard(@Valid @ModelAttribute(name="studentref") Student student,BindingResult result)
	{
		log.info(student.toString());
		if(result.hasErrors()) {
			return new ModelAndView("stud","studentref",student);
		}
		else {
			return new ModelAndView("stud");
		}
		
	}
}
