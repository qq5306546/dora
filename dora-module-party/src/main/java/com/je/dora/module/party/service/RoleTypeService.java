package com.je.dora.module.party.service;

import java.util.List;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.je.dora.module.party.model.RoleType;
import com.je.dora.module.party.model.RoleTypeParent;

/**
 * 角色类型
 * @author wubei
 *
 */
public interface RoleTypeService {

	/**
	 * 保存一个新的角色类型
	 * @param 
	 * 		roleType 角色对象
	 * @return
	 * 		int 执行成功的数量
	 */
	public int insert(RoleType roleType);
	
	/**
	 * 修改一个角色类型
	 * @param 
	 * 		roleType 角色对象
	 * @return
	 * 		int 执行成功的数量
	 */
	public int update(RoleType roleType);
	
	/**
	 * 唯一标识查询角色类型
	 * @param 
	 * 		roleTypeId 唯一标识
	 * @return
	 * 		RoleType 返回角色对象
	 */
	public RoleType selectById(String roleTypeId);
	
	/**
	 * 关键字查询角色类型
	 * @param 
	 * 		keyword 角色类型描述 or 上级角色类型描述
	 * @param 
	 * 		pageBounds 分页参数
	 * @return
	 * 		List<RoleTypeParent> 返回包涵上级角色类型描述的集合
	 */
	public List<RoleTypeParent> selectPage(String keyword, PageBounds pageBounds);
	
	/**
	 * 上级角色类型标识查询
	 * @param 
	 * 		parentTypeId 上级角色类型标识
	 * @return
	 * 		List<RoleType> 返回角色类型集合
	 */
	public List<RoleType> selectByParentTypeId(String parentTypeId);
	
}
