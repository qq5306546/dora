package com.je.dora.module.party.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.je.dora.core.base.controller.BaseController;

@Controller
@RequestMapping("party")
public class PartyController extends BaseController {

	@RequestMapping("index")
	public ModelAndView index() {
		return render("party/index");
	}
}
