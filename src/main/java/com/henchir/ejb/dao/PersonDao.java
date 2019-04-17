package com.henchir.ejb.dao;

import javax.ejb.Remote;

import com.henchir.ejb.model.Person;

@Remote
public interface PersonDao extends GenericDao<Person> {

	public void save(Person person);
}
