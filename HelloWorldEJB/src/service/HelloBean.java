package service;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Person;

/**
 * Session Bean implementation class HelloBeannnn
 */
@Singleton
public class HelloBean implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@PersistenceContext
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public HelloBean() {
		// TODO Auto-generated constructor stub
	}

	public String sayHello(String name) {

		return "Hello" + name;
	}

	@SuppressWarnings("unchecked")
	public List<Person> findAll() {

		return (List<Person>) em.createNamedQuery("Person.findAll").getResultList();
	}

}
