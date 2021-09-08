package com.project.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.project.demo.entity.Employee;
import com.project.demo.entity.EmployeeTask;
import com.project.demo.repository.EmployeeRepository;
import com.project.demo.repository.TaskRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	TaskRepository taskRepository;
	
	public List<Employee> getEmployees() 
	{
		return employeeRepository.findAll() ;
	}


	public Optional<Employee> getEmployeeById(int id) 
	{
		return employeeRepository.findById(id);
	}


	public Employee addEmployee(Employee employee) 
	{
		return employeeRepository.save(employee);
	}


	public Employee editEmployee(Employee employee) {
		Employee existingEmployee = employeeRepository.findById(employee.getId()).orElse(null);
		existingEmployee.setFirstname(employee.getFirstname());
		existingEmployee.setLastname(employee.getLastname());
		existingEmployee.setAge(employee.getAge());
		existingEmployee.setPhonenumber(employee.getPhonenumber());
		existingEmployee.setEmail(employee.getEmail());
		existingEmployee.setSalary(employee.getSalary());
		return employeeRepository.save(existingEmployee);
	}


	public Page<Employee> getEmployeeByPage(Pageable page)
	{
		
		return employeeRepository.findAll(page);
	}


	public List<EmployeeTask> getTaskDetails() {
		
		return taskRepository.findAll();
	}


	public EmployeeTask addTask(EmployeeTask task) {
		
		return taskRepository.save(task);
	}

    
	
	
}
