package com.je.dora.manage.web.party;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.je.dora.core.base.controller.BaseController;
import com.je.dora.module.party.service.RoleTypeService;

@Controller
@RequestMapping("party/roletype")
public class RoleTypeController extends BaseController {
	
	@Autowired
	private RoleTypeService roleTypeService;

	@RequestMapping("index")
	@ResponseBody
	public Object index() {
		logger.debug(roleTypeService + "-------------------------------\n");
		return roleTypeService.selectPage(new PageBounds(1, 10));
	}
}
