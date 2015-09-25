package com.je.dora.core.base.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.je.dora.core.base.mybatis.dao.BaseDAO;
import com.je.dora.core.base.mybatis.model.BaseModel;
import com.je.dora.core.utils.BeanUtil;

@SuppressWarnings("rawtypes")
public abstract class BaseServiceImpl<T extends BaseModel, ID extends Serializable> implements BaseService<T, ID> {
	
	protected final Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	protected BaseDAO<T, ID> baseDAO;
	
	public void setDao(BaseDAO<T, ID> baseDAO) {  
        this.baseDAO = baseDAO;  
    }
	
	public long selectCount() {
		return baseDAO.selectCount();
	}

	public long selectCount(Map params) {
		return baseDAO.selectCount(params);
	}

	public long selectCount(T model) {
		return baseDAO.selectCount(BeanUtil.beanToMap(model));
	}

	public List<T> select() {
		return baseDAO.select();
	}

	public List<T> select(Map params) {
		return baseDAO.select(params);
	}

	public List<T> select(T model) {
		return baseDAO.select(BeanUtil.beanToMap(model));
	}
	
	public PageList<T> selectPage(PageBounds pageBounds) {
		return baseDAO.select(null, pageBounds);
	}
	
	public PageList<T> selectPage(Map params, PageBounds pageBounds) {
		return baseDAO.select(params, pageBounds);
	}
	
	public PageList<T> selectPage(T model, PageBounds pageBounds) {
		return baseDAO.select(BeanUtil.beanToMap(model), pageBounds);
	}

	public T selectById(ID id) {
		return baseDAO.selectById(id);
	}

	public int delete() {
		return baseDAO.delete();
	}

	public int delete(Map params) {
		return baseDAO.delete(params);
	}

	public int delete(T model) {
		return baseDAO.delete(BeanUtil.beanToMap(model));
	}

	public int deleteById(ID id) {
		return baseDAO.deleteById(id);
	}

	public int insert(T model) {
		return baseDAO.insert(model);
	}

	public int update(T model) {
		return baseDAO.update(model);
	}
	
}
