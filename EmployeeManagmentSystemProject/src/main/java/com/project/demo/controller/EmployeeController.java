package com.project.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.entity.Employee;
import com.project.demo.entity.EmployeeTask;
import com.project.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@GetMapping("/get/all")
	public List<Employee> getEmployee()
	{
		return employeeService.getEmployees();
	}
	
	
	@GetMapping("/get/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable ("id") int id) {
		return employeeService.getEmployeeById(id);
	}
	
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return employeeService.addEmployee(employee);
	}

	
	@PutMapping("/edit")
	public Employee editEmployee(@RequestBody Employee employee) 
	{
		return employeeService.editEmployee(employee);
	}	
	
	
	@GetMapping("/page")
	public Page<Employee> getEmployeeByPage(Pageable page)
	{
		return employeeService.getEmployeeByPage(page);
	}
	
	
	@GetMapping("/task/get/all")
	public List<EmployeeTask> getTaskDetails()
	{
		return employeeService.getTaskDetails();
	}
	
	
	@PostMapping("/task/add")
	public EmployeeTask addTask(@RequestBody EmployeeTask task) 
	{
		return employeeService.addTask(task);
	}
	
}
