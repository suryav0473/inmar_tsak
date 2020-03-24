package com.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
