package com.je.dora.module.party.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.je.dora.core.base.service.BaseServiceImpl;
import com.je.dora.module.party.dao.RoleTypeDAO;
import com.je.dora.module.party.model.RoleType;
import com.je.dora.module.party.model.RoleTypeParent;
import com.je.dora.module.party.service.RoleTypeService;

@Service
public class RoleTypeServiceImpl extends BaseServiceImpl<RoleType, String> implements RoleTypeService {

	@Autowired
    public void setDao(RoleTypeDAO roleTypeDAO) {  
		super.setDao(roleTypeDAO);
    }
	
	@Override
	public List<RoleTypeParent> selectPage(String keyword, PageBounds pageBounds) {
		RoleTypeDAO dao = (RoleTypeDAO) baseDAO;
		return dao.selectPage(keyword, pageBounds);
	}
	
	@Override
	public List<RoleType> selectByParentTypeId(String parentTypeId) {
		RoleType params = new RoleType();
		params.setParentTypeId(parentTypeId);
		return super.select(params);
	}
	
}
