package service;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Local;

import model.Person;

@Local
public interface IHelloBean extends Serializable{
	
	public String sayHello(String name);

	public List<Person> findAll();

}

