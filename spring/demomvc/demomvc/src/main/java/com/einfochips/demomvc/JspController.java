package com.einfochips.demomvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class JspController {
	
	@RequestMapping("index")
	public String firstpage() {
		return "index.jsp";
	}
	
//	@RequestMapping("adddata")
//	public String register(HttpServletRequest req) {
//		System.out.println(req.getParameter("uname"));
//		System.out.println(req.getParameter("email"));
//		System.out.println(req.getParameter("pass"));
//		System.out.println(req.getParameter("address"));
//		System.out.println(req.getParameter("mobile"));
//		return "";
//	}
	
	@RequestMapping("adddata")
	public ModelAndView addRegister(HttpServletRequest req) throws Exception {
		ModelAndView mv = new ModelAndView("success.jsp");
		
		String name = req.getParameter("uname");
		if(name.length()>=1) {
			mv.addObject("value1", name);
		}
		else {
			mv.addObject("value1", "you have entered less then 1");
		}
		
		String mail = req.getParameter("email");
		mv.addObject("value2", mail);
		
		String password = req.getParameter("pass");
		mv.addObject("value3", password);
		
		String add = req.getParameter("address");
		mv.addObject("value4", add);
		
		String mob = req.getParameter("mobile");
		mv.addObject("value5", mob);
		
		UserDao ud = new UserDao();
		User u = new User(name,mail,password,add,mob);
		ud.insertUser(u);
		
		return mv;
	}
	
	@RequestMapping("login")
	public ModelAndView addLogin() {
		return new ModelAndView("Login.jsp");
	}
}
