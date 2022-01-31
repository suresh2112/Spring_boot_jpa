package com.createiq.ems.Service;

import java.util.List;

import javax.print.attribute.standard.MediaSize.Other;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.createiq.ems.model.Employee;
import com.createiq.ems.repo.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository 	employeeRepository; 
	@Override
	public Employee SaveEmp(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmp(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> findAll() {
		
		return employeeRepository.findAll();
	}

	@Override
	public Employee find_by_Id(Integer eid) {
		
		return employeeRepository.findById(eid).orElse(null);
	}

	@Override
	public List<Employee> find_by_name(String ename) {
		
		return employeeRepository.findByEname(ename);
	}

	@Override
	public void delete_by_id(Integer eid) {
		 employeeRepository.deleteById(eid);
		
		
	}

	@Override
	public List<Employee> find_by_Ename_Esal(String ename, Double esal) {
		// TODO Auto-generated method stub
		return employeeRepository.findByEnameAndEsal(ename, esal);
	}

	@Override
	public String findNameById(Integer eid) {
		// TODO Auto-generated method stub
		return employeeRepository.findNameById(eid);
	}

	@Override
	public Double findNameAndSalaryById(Integer eid) {
		// TODO Auto-generated method stub
		return employeeRepository.findNameAndSalaryById(eid);
	}

	@Override
	public List<Employee> findbysal(Double esal) {
		// TODO Auto-generated method stub
		return employeeRepository.findByEsal(esal);
	}

	@Override
	public List<Employee> findFirst3ByEnameOrderByEnameAsc(String ename) {
		// TODO Auto-generated method stub
		return employeeRepository.findFirst3ByEnameOrderByEnameAsc(ename);
	}

}
