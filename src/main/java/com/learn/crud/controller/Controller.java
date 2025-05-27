package com.learn.crud.controller;

import java.util.List;
import java.util.Optional;

import com.learn.crud.exceptions.CustomException;
import com.learn.crud.service.EmployeeServiceimpl;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.crud.entity.Employee;
import com.learn.crud.entity.EmployeeDTO;

@RestController
public class Controller {
	
	@Autowired
	EmployeeServiceimpl employeeService;
	
	@GetMapping("/hi")
	public String hello()
	{
		return "hello hello";
	}
	
	@PostMapping("/saveEmployee")
	public Employee save(@RequestBody @Valid EmployeeDTO employeeDto) throws CustomException {
		Employee saveEmployee = employeeService.save(employeeDto);
		return saveEmployee;
	}
	
	@GetMapping("/findAll")
	public List<Employee> findAll(Employee employee){
		
		List<Employee> allEmp = employeeService.findAll(employee);
		return allEmp;
	}
	
	@GetMapping("/findById/{id}")
	public Optional<Employee> findById(@PathVariable("id") Long id) throws CustomException {
		
		Optional<Employee> employeeByID = employeeService.findById(id);
		return employeeByID;
		
	}
	
	@DeleteMapping("/deleteAll")
	public void deleteAll() {
		employeeService.deleteAll();
	}
	
	@DeleteMapping("/deleteById/{id}")
	public void deleteById(@PathVariable("id") Long id) throws CustomException {
	
		employeeService.deleteById(id);
	}
}

