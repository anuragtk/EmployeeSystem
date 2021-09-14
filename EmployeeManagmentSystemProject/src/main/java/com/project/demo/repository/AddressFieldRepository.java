package com.project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.demo.entity.AddressField;

public interface AddressFieldRepository extends JpaRepository<AddressField, Integer> {

}
