package com.learn.crud.entity;

import org.springframework.data.annotation.Id;

import jakarta.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;



public class EmployeeDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    @NotBlank(message = "First name is required")
    @Size(min = 2, max = 50, message = "First name must be between 2 and 50 characters")
	private String firstName;
    
    @NotBlank(message = "Last name is required")
    @Size(min = 2, max = 50, message = "Last name must be between 2 and 50 characters")
	private String lastName;
    
    @NotBlank(message = "User name is required")
    @Size(min = 5, max = 10, message = "User name must be between 5 and 10 characters" )
	private String userName;
    
    @NotBlank(message = "Role is required")
    @Size(min = 2, max = 50, message = "Role must be between 2 and 50 characters" )
	private String role;
    
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
	private String email;
    
    @NotBlank(message = "Address is required")
    @Size(min = 2)
	private String address;
    
    @NotNull(message = "Salary is required")
	private Long salary;
    
	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public EmployeeDTO(Long id, String firstName, String lastName, String role, String email, String address, String userName,
					Long salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
		this.email = email;
		this.address = address;
		this.salary = salary;
		this.userName=userName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", role=" + role
				+ ", email=" + email + ", address=" + address + ", salary=" + salary + "]";
	}
	
	
}
