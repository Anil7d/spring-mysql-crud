package com.learn.crud.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.crud.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	
}
