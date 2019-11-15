package com.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.Employee;

//spring boot data rest 
@RepositoryRestResource(collectionResourceRel ="employee",path = "employee" )
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
