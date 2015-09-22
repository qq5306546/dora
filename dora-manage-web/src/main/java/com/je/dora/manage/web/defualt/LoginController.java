package com.je.dora.manage.web.defualt;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.je.dora.core.base.controller.BaseController;

@Controller
@RequestMapping("/")
public class LoginController extends BaseController {

	@RequestMapping("/login")
	public ModelAndView login(String username, String password) {
		if (StringUtils.isNotBlank(username) && 
				StringUtils.isNotBlank(password)) {
			return redirect("/admin");
		}
		return render("defualt/login");
	}
	
}
