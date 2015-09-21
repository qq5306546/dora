package com.je.dora.module.party.dao;

import com.je.dora.core.base.mybatis.annotation.MyBatisDAO;
import com.je.dora.core.base.mybatis.dao.BaseDAO;
import com.je.dora.module.party.model.Party;

/**
 * 当事人DAO
 * @author wubei
 *
 */
@MyBatisDAO
public interface PartyDAO extends BaseDAO<Party, String> {


}