package com.lin.dao;

import java.util.List;
import java.util.Map;

import com.lin.entity.BaseEntity;

/**
 * DAO基类，其它DAO可以直接继承这个DAO，不但可以复用共用的方法，还可以获得泛型的好处。
 */
public interface BaseDao<T> {

	public void add(T t);

	public void update(T t);

	public void delete(Object id);

	public T queryById(Object id);
	
	public int queryCount(Map<String , Object> map);
	
	public List<T> queryList(Map<String , Object> map);

}