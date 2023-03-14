package com.ef.springmvc.service;

import java.util.List;

import com.ef.springmvc.entity.Department;

public interface DepartmentService {
	
	public List < Department > getDepartment();
	
	public void saveDepartment(Department theDepartment);
	
	public Department getDepartment(int theID);
	public void deleteDepartment(int theID);

}
