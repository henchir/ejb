package com.henchir.ejb.dao.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.henchir.ejb.dao.GenericDao;

@Stateless
public class GenericDaoImpl<T> implements GenericDao<T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2283815311570222640L;

	@PersistenceContext(unitName = "userPersistanceUnit")
	protected EntityManager entityManager;

	public void saveOrUpdate(T entity) {
		entityManager.persist(entity);
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}
}
