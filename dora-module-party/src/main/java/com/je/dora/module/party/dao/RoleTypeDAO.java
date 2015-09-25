package com.je.dora.module.party.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.je.dora.core.base.mybatis.annotation.MyBatisDAO;
import com.je.dora.core.base.mybatis.dao.BaseDAO;
import com.je.dora.module.party.model.RoleType;
import com.je.dora.module.party.model.RoleTypeParent;

/**
 * 角色类型DAO
 * @author wubei
 *
 */
@MyBatisDAO
public interface RoleTypeDAO extends BaseDAO<RoleType, String> {

	public List<RoleTypeParent> selectPage(@Param("keyword") String keyword, PageBounds pageBounds);

}