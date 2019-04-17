package com.henchir.ejb.service.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.henchir.ejb.dao.PersonDao;
import com.henchir.ejb.model.Person;
import com.henchir.ejb.service.PersonService;

@Stateless
public class PersonServiceImpl implements PersonService {

	@EJB
	PersonDao personDao;

	public void save(Person person) {
		personDao.save(person);
	}

}
