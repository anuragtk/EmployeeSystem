package com.project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.demo.entity.EmployeeTask;

public interface TaskRepository extends JpaRepository<EmployeeTask, Integer> {

}
