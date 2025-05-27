package com.learn.crud.service;

import java.util.List;
import java.util.Optional;

import com.learn.crud.exceptions.CustomException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.crud.entity.Employee;
import com.learn.crud.repo.EmployeeRepo;

@Service
public class EmployeeServiceimpl implements EmployeeService {

	@Autowired
	EmployeeRepo employeeRepo;
	
	public Employee save(Employee employee) throws CustomException {
		Boolean isExists=employeeRepo.existsByUserName(employee.getUserName());

		if(isExists){
			throw new CustomException("User exists");
		}
		Employee emp = employeeRepo.save(employee);
		return emp;
	}
	
	public List<Employee> findAll(Employee employee){
		
		List<Employee> allEmp = employeeRepo.findAll();
		
		return allEmp;
	}
	
	public Optional<Employee> findById(Long id) throws CustomException {
		Boolean isExists=employeeRepo.existsById(id);
		if (!isExists){
			throw new CustomException("User doesn't exist");
		}
		
		Optional<Employee> employeeById = employeeRepo.findById(id);
		
		return employeeById;
		
	}
	
	public void deleteAll() {
		
		 employeeRepo.deleteAll();
	}
	
	public void deleteById(Long id) {
		employeeRepo.deleteById(id);
	}
}
