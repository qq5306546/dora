package com.je.dora.manage.web.defualt;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.je.dora.core.base.controller.BaseController;

@Controller
@RequestMapping("/")
public class DefualtController extends BaseController {
	
	@RequestMapping("/login")
	public ModelAndView login(String username, String password) {
		if (StringUtils.isNotBlank(username) && 
				StringUtils.isNotBlank(password)) {
			return redirect("/");
		}
		return render("defualt/login");
	}
	
	@RequestMapping
	public ModelAndView index() {
		return render("defualt/index");
	}
	
	@RequestMapping("/home")
	public ModelAndView home() {
		return render("defualt/home");
	}
	
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		return "<h1>test</h1>";
	}
}
