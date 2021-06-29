package com.result.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.result.test.dao.StudentDao;
import com.result.test.model.Student;

@Controller
public class StudentController {

	@Autowired
	StudentDao sdao;
	
	@RequestMapping("/home")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView();
		System.out.println("In login");
		mv.setViewName("home.jsp");
		return mv;
	}
	
	@RequestMapping("/addResultForm")
	public ModelAndView addStudent() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addStudent.jsp");
		return mv;
	}
	
	@RequestMapping("/addStudent")
	public ModelAndView addStudent(Student std) {
		ModelAndView mv = new ModelAndView();
		System.out.println(std.toString());
		sdao.save(std);
		mv.setViewName("home.jsp");
		return mv;
	}
	
	@RequestMapping("/viewResult")
	public ModelAndView viewResult(@RequestParam long sregno) {
		ModelAndView mv = new ModelAndView("viewResult.jsp");
		Student std = sdao.findById(sregno).orElse(new Student());
		mv.addObject("sname",std.getSname());
		mv.addObject("gpa",std.getGpa());
		return mv;
	}
	
	/*
	@RequestMapping("/login")
	public ModelAndView login(String id, String pass){
		ModelAndView mv = new ModelAndView();
		try{
			if(id.equals("admin") && pass.equals("root")) {
				throw new Exception("Invalid Login");
			}else {
				mv.setViewName("viewResult.jsp");
			}
		}catch(Exception e) {
			mv.setViewName("login.jsp");
		}
		return mv;
	}	
	*/
}
