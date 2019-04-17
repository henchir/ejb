package com.henchir.ejb.dao;

import java.io.Serializable;

import javax.ejb.Remote;

@Remote
public interface GenericDao<T> extends Serializable {

	public void saveOrUpdate(T entity) throws Exception;

}
