package bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import service.HelloBean;

@ManagedBean
public class UserBean {
	
	@EJB
	private HelloBean bean;
	
	private String name;
	private String surename;
	
	public String getName() {
		name = bean.findAll().get(0).getName();
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurename() {
		return surename;
	}
	public void setSurename(String surename) {
		this.surename = surename;
	}
	
	

}
