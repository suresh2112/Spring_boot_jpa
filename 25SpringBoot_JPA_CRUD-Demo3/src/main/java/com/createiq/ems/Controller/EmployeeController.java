package com.createiq.ems.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.createiq.ems.Service.EmployeeService;
import com.createiq.ems.model.Employee;

@RestController
@RequestMapping("/emplyeejpa")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save")
	public ResponseEntity<?> Save_Employee(@RequestBody Employee employee){
		
		return new ResponseEntity(employeeService.SaveEmp(employee),HttpStatus.OK);
	}
	@GetMapping("/findall")
	public ResponseEntity<?> find_All(){
		return new ResponseEntity(employeeService.findAll(),HttpStatus.OK);
	}
	@GetMapping("findbyid/{eid}")
	public ResponseEntity<?> Find_By_Id(@PathVariable("eid") Integer eid){
		return new ResponseEntity(employeeService.find_by_Id(eid),HttpStatus.OK);
	}
	@DeleteMapping("/delete/{eid}")
	public String Delete_By_Id(@PathVariable("eid") Integer eid){
		employeeService.delete_by_id(eid);
		return "record deleted successfully with id::  "+eid;
	}
	@PutMapping("update")
	public ResponseEntity<?> Update_Employee(@RequestBody Employee employee) {
	return	new ResponseEntity(employeeService.updateEmp(employee),HttpStatus.OK);
		}
	@GetMapping("/byname/{ename}")
	public ResponseEntity<?> ByName(@PathVariable("ename") String ename){
		return new ResponseEntity(employeeService.find_by_name(ename),HttpStatus.OK);
	}
	@GetMapping("/nameandsal/{ename}/{esal}")
	public ResponseEntity<?> ByName_And_By_Esal(@PathVariable("ename") String ename,@PathVariable("esal") Double esal){
		return new ResponseEntity(employeeService.find_by_Ename_Esal(ename, esal),HttpStatus.OK);
	}
	@GetMapping("findnamebyid/{eid}")
	public ResponseEntity<?> findbynameusingid(@PathVariable("eid") Integer eid){
		return new ResponseEntity(employeeService.findNameById(eid),HttpStatus.OK);
	}
	@GetMapping("/findnameandsalarybyID/{eid}")
	public ResponseEntity<?>  findNameAndSalaryById(@PathVariable("eid") Integer eid){
		return new ResponseEntity(employeeService.findNameAndSalaryById(eid),HttpStatus.OK);
	}
	@GetMapping("/findbysal/{esal}")
	public ResponseEntity<?> findbysal(@PathVariable("esal") Double esal){
		return new ResponseEntity(employeeService.findbysal(esal),HttpStatus.OK);
	}
	@GetMapping("/findFirst3ByEnameOrderByEnameAsc/{ename}")
	public ResponseEntity<?> findfirst(@PathVariable("eid") String ename){
		return new ResponseEntity(employeeService.findFirst3ByEnameOrderByEnameAsc(ename),HttpStatus.OK);
	}

}
