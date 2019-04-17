package com.henchir.ejb.dao;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.henchir.ejb.dao.impl.PersonDaoImpl;
import com.henchir.ejb.model.Person;

public class PersonDaoTest {

	private PersonDao personDao = new PersonDaoImpl();
	
	@Test
	public void testAdd() {
		Person p = new Person(4, "name", "location");	
		personDao.save(p);
		assertTrue("message", p.getId() > 0);
	}
}
