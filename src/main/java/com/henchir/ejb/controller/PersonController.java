package com.henchir.ejb.controller;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import com.henchir.ejb.model.Person;
import com.henchir.ejb.service.impl.PersonCrud;

@Path("person")
@RequestScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonController {

	@EJB
	private PersonCrud personCrud;

	@Context
	private UriInfo context;

	@GET
	public List<Person> getAllPersons() {
		return personCrud.allPersons();
	}

	@POST
	public Person addStudent(Person person) {
		return personCrud.savePerson(person);

	}

	@PUT
	@Path("/{sId}")
	public Person updateStudent(@PathParam("sId") long id, Person person) throws Exception {
		person.setId(id);
		return personCrud.updatePerson(person);
	}

	@DELETE
	@Path("/{sId}")
	public void deleteMessage(@PathParam("sId") long id) throws Exception {
		personCrud.deletePerson(id);
	}

	@GET
	@Path("/{sId}")
	public Person getPerson(@PathParam("sId") long id) {
		return personCrud.singlePerson(id);
	}
}
