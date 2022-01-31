package com.createiq.ems.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries(value = { @NamedQuery(name = "empfindbysal", query = "select e from Employee e where e.esal=:esal") })
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	Integer eid;
	String ename;
	Double esal;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(Integer eid, String ename, Double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}


	public Integer getEid() {
		return eid;
	}


	public void setEid(Integer eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public Double getEsal() {
		return esal;
	}


	public void setEsal(Double esal) {
		this.esal = esal;
	}
	

}
