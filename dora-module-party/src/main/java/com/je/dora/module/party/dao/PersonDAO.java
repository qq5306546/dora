package com.je.dora.module.party.dao;

import com.je.dora.core.base.mybatis.annotation.MyBatisDAO;
import com.je.dora.core.base.mybatis.dao.BaseDAO;
import com.je.dora.module.party.model.Person;

/**
 * 当事人-人员DAO
 * @author wubei
 *
 */
@MyBatisDAO
public interface PersonDAO extends BaseDAO<Person, String>  {


}