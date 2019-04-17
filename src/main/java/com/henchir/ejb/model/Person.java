package com.henchir.ejb.model;
// Generated Mar 18, 2019 12:24:55 PM by Hibernate Tools 5.2.11.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Person generated by hbm2java
 */
@Entity
@Table(name = "person", schema = "public")
public class Person implements java.io.Serializable {

	private long id;
	private String name;
	private String location;

	public Person() {
	}

	public Person(long id) {
		this.id = id;
	}

	public Person(long id, String name, String location) {
		this.id = id;
		this.name = name;
		this.location = location;
	}

	@Id

	@Column(name = "id", nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "location")
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
