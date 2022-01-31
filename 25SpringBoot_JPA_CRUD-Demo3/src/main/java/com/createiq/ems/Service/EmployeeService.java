package com.createiq.ems.Service;

import java.util.List;

import com.createiq.ems.model.Employee;

public interface EmployeeService {
	
	
	public Employee SaveEmp(Employee employee);
	public Employee updateEmp(Employee employee);
	
	public List<Employee> findAll();
	public Employee find_by_Id(Integer eid);
	public List<Employee> find_by_name(String ename);
	public void delete_by_id(Integer eid);
	public List<Employee> find_by_Ename_Esal(String ename,Double esal);
	
	public String findNameById(Integer eid);
	public Double  findNameAndSalaryById(Integer eid);
	public List<Employee> findbysal(Double esal);
	 public List<Employee> findFirst3ByEnameOrderByEnameAsc(String ename);
	 

}
