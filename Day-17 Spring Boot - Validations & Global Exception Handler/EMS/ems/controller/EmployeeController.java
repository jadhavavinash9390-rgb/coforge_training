package com.coforge.ems.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
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

import com.coforge.ems.exception.EmployeeNotFoundException;
import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;
import com.coforge.ems.service.EmployeeService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@RestController // rest full application,because it is not a web application
@RequestMapping("/api/v1/ems")
public class EmployeeController {

	private EmployeeService service;

	private Environment environment;// used because application propertirs is a .properties file not a class so this
									// helps in getting the application properties

	// field injection used for testing

	@Autowired
	public EmployeeController(EmployeeService service, Environment environment) {
		super();
		this.service = service;
		this.environment = environment;
	}

	@PostMapping("/employees")
	public ResponseEntity<String> saveEmployee( @Valid @RequestBody Employee employee) {

	    boolean status = service.saveEmployee(employee);

	    if (status) {
	        return new ResponseEntity<>(
	                environment.getProperty("ems.save.success"),
	                HttpStatus.CREATED);
	    }

	    return null;
	}

	@PutMapping("/employees/{eid}")
	public ResponseEntity<String> updateEmployee(@PathVariable int eid,  @Valid @RequestBody Employee employee) {

	    boolean status = service.updateEmployee(eid, employee);

	    if (status) {
	        return new ResponseEntity<>(
	                environment.getProperty("ems.update.success"),
	                HttpStatus.CREATED);
	    }

	    return null;
	}

	@DeleteMapping("/employees/{eid}")
	public ResponseEntity<String> deleteByEid( @PathVariable("eid") int eid) {

		ResponseEntity<String> responseEntity = null;
		
			boolean status = service.deleteByEid(eid);
			if (status) {
				responseEntity = new ResponseEntity<>(environment.getProperty("ems.delete.success"),
						HttpStatus.CREATED);
			}
		

		return responseEntity;
	}
	
	
	@DeleteMapping("/employees/ename/{ename}")
	public ResponseEntity<?> deleteByEname( @PathVariable ("ename") String ename) { 

		ResponseEntity<?> responseEntity = null;
		
			boolean status = service.deleteByEname(ename);
			
				responseEntity = new ResponseEntity<>(environment.getProperty("ems.delete.success"), HttpStatus.OK);
			
		

		return responseEntity;
	}
	

	@GetMapping("/employees/{eid}")
	public ResponseEntity<?> getByEid( @PathVariable int eid) {
		
		ResponseEntity<?> responseEntity = null;
	   

	        Optional<Employee> employees = service.getByEid(eid);

	        if (employees.isPresent()) {
	        	responseEntity = new ResponseEntity<>(employees,HttpStatus.OK);
	        }

		return responseEntity;
	}
	
	@GetMapping("/employees/ename/{ename}")
	public ResponseEntity<?> getByEname(@PathVariable ("ename") String ename)  {
		
		ResponseEntity<?> responseEntity = null;
	 

	        List<Employee> employees = service.findByEname(ename);

	        	responseEntity = new ResponseEntity<>(employees,HttpStatus.OK);
	        

		return responseEntity;
	}
	
	
	
	@GetMapping("/employees")
	public ResponseEntity<?> findAll() {

		ResponseEntity<?> responseEntity = null;
		
			List<Employee>  employees = service.findAll();
				responseEntity = new ResponseEntity<>(employees,HttpStatus.OK);
			
		return responseEntity;
	}
	
	@GetMapping("/employees/eids")
	public ResponseEntity<?> getEidsList() {
		ResponseEntity<?> responseEntity = null;
		
		List<Integer> eids = service.getEidsList();
		responseEntity = new ResponseEntity<> (eids, HttpStatus.OK);
		
		return responseEntity;
	}
	
	@GetMapping("/employees/info")
	public ResponseEntity<?> getInfo() {

	    ResponseEntity<?> responseEntity = null;


	        String info = service.getInfo();

	        responseEntity = new ResponseEntity<>(info, HttpStatus.OK);


	    return responseEntity;
	}
}