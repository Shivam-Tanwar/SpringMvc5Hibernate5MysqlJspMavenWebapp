package com.ef.springmvc.service;

import java.util.List;

import com.ef.springmvc.entity.Department;

public interface DepartmentService {
	
	public List < Department > getDepartment();
	
	public void saveDepartment(Department theDepartment);
	
	public Department getDepartment(String deptName);
	public void deleteDepartment(String deptName);

}
