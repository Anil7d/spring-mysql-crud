package com.learn.crud.utility;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learn.crud.entity.Employee;
import com.learn.crud.entity.EmployeeDTO;

@Component
public class Utility {
	@Autowired
	ModelMapper modelMapper;

	public Employee convertClientDtoToClient(EmployeeDTO employeeDto) {

		Employee employee = modelMapper.map(employeeDto, Employee.class);
//        client.setPassword(passwordEncoder.encode(client.getPassword()));
		return employee;
	}
}
