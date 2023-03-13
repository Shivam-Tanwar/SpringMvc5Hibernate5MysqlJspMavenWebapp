package com.ef.springmvc.dao;

import java.util.List;

import com.ef.springmvc.entity.Department;

public interface DepartmentDAO {
	
	public List <Department> getDepartment();
	
	public void saveDepartment(Department theDepartment);
	
	public Department getDepartment(int theId);
	
	public void deleteDepartment(int theId);
	

}
