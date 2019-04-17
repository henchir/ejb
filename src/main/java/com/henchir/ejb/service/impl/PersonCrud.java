package com.henchir.ejb.service.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.henchir.ejb.model.Person;
 

@Stateless
public class PersonCrud {
 
    @PersistenceContext(unitName = "userPersistanceUnit")
    private EntityManager em;
 
    public List<Person> allPersons() {
        Query q = em.createQuery("select p from Person p");
        return (List<Person>) q.getResultList();
    }
 
    public Person singlePerson(Long id) {
        Query q = em.createQuery("SELECT p FROM person p where p.id = :id");
        q.setParameter("id", id);
        return (Person) q.getSingleResult();
    }
     
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public Person savePerson(Person person) {
        em.persist(person);
        em.flush();
        return person;
    }
 
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public Person updatePerson(Person person) throws Exception {
        try {
            em.merge(person);
            em.flush();
            return person;
        } catch (Exception e) {
 
            System.out.println(e);
            return null;
        }
    }
 
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void deletePerson(long id) throws Exception {
        try {
            System.out.println("id : " + id);
            Query q = em.createQuery("SELECT p FROM Person s WHERE p.id = :id");
            q.setParameter("id", id);
             
            em.remove(em.merge(q.getSingleResult()));
            em.flush();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}