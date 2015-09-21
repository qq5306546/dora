package com.je.dora.core.base.mybatis.autobuilder;

import java.util.HashMap;
import java.util.Map;

/**
 * 自动代码生成
 * 
 * @author cs
 * 
 */
public class AutoBuilder {
 
	// 源文件所在工程目录
	static String SRC_PROJECT_PATH = "/Users/wubei/Desktop";
	// 代码文件生成路径
	static String PAKAGE_PATH = "com.je.dora.module.party";
	// 数据库配置文件
	static Map<String, String> DB_PROPERTIES = new HashMap<String, String>();
	// 根据表自行定义
	static String[] TABLE_NAME = {"person","party","party_group","party_role","role_type","party_status","party_relationship","party_relationship_type"};

	public static void main(String[] args) throws Exception {
		DB_PROPERTIES.put("jdbc_driverClassName", "com.mysql.jdbc.Driver");
		DB_PROPERTIES.put("jdbc_url", "jdbc:mysql://localhost:3306/mydb?useUnicode=true&amp;characterEncoding=utf-8");
		DB_PROPERTIES.put("jdbc_username", "root");
		DB_PROPERTIES.put("jdbc_password", "root");
		
		for (String name : TABLE_NAME) {
			Entity entity = new Entity(PAKAGE_PATH, SRC_PROJECT_PATH);
			entity.builderEntity(DB_PROPERTIES, name);
			entity.buildIbatis();
		}
	}
}
