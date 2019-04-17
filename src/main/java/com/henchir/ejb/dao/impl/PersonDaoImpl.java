package com.henchir.ejb.dao.impl;

import javax.ejb.Stateless;

import com.henchir.ejb.dao.PersonDao;
import com.henchir.ejb.model.Person;

@Stateless
public class PersonDaoImpl extends GenericDaoImpl<Person> implements PersonDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3429737933587470270L;

	public void save(Person person) {
		super.saveOrUpdate(person);
	}

}
