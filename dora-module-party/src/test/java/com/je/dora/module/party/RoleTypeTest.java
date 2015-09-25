package com.je.dora.module.party;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.je.dora.module.party.model.RoleType;
import com.je.dora.module.party.model.RoleTypeParent;
import com.je.dora.module.party.service.RoleTypeService;

@RunWith(JUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath*:test/spring-mybatis.xml" })  
public class RoleTypeTest {
	
	@Autowired
	private RoleTypeService roleTypeService;

	@Test
	public void insert() {
		RoleType roleType = new RoleType();
		roleType.setRoleTypeId("4");
		roleType.setDescription("测试保存");
		roleType.setParentTypeId("1");
		roleType.setHasTable("N");
		roleType.setNowTime();
		roleTypeService.insert(roleType);
	}
	
	@Test
	public void update() {
		RoleType roleType = new RoleType();
		roleType.setRoleTypeId("4");
		roleType.setDescription("保存111");
		roleType.setParentTypeId("1");
		roleType.setHasTable("N");
		roleType.setNowTime();
		roleTypeService.update(roleType);
	}
	
	@Test
	public void selectById() {
		roleTypeService.selectById("1");
	}
	
	@Test
	public void selectPage() {
		List<RoleTypeParent> item = roleTypeService.selectPage("", new PageBounds(1, 10));
		for (RoleTypeParent rtp : item) {
			System.out.println(rtp.getDescription() + "_" + rtp.getParentDescription());
		}
	}
	
	@Test
	public void selectByParentTypeId() {
		roleTypeService.selectByParentTypeId("1");
	}
}
