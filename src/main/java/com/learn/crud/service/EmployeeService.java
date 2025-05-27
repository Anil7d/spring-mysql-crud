package com.learn.crud.service;

import com.learn.crud.entity.Employee;
import com.learn.crud.entity.EmployeeDTO;
import com.learn.crud.exceptions.CustomException;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public Employee save(EmployeeDTO employee) throws  CustomException;
    public List<Employee> findAll(Employee employee);
    public Optional<Employee> findById(Long id) throws CustomException;
    public void deleteAll();
    public void deleteById(Long id) throws CustomException;
}
