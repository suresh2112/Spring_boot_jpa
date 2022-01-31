package com.createiq.ems.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.createiq.ems.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	public List<Employee> findByEname(String ename);
	
	public List<Employee> findByEnameAndEsal(String ename,Double esal);
	
	@Query("select e.ename from Employee e where e.eid=:eid")
	public String  findNameById(@Param("eid") Integer eid);
	
	@Query("select e.esal from Employee e where e.eid=:eid")
	public Double findNameAndSalaryById(@Param("eid") Integer eid);
	@Query(name = "empfindbysal")
	public List<Employee> findByEsal(@Param("esal") Double esal);
	
	 public List<Employee> findFirst3ByEnameOrderByEnameAsc(String ename);

}
