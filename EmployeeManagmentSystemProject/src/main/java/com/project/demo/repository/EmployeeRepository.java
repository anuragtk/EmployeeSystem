package com.project.demo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.project.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> , PagingAndSortingRepository<Employee, Integer>{

	   
    Page<Employee> findAll(Pageable pageable);
		
	
}
