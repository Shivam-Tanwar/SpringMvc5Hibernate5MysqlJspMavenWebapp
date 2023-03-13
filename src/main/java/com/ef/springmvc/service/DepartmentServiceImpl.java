package com.ef.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ef.springmvc.dao.DepartmentDAO;
import com.ef.springmvc.entity.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentDAO departmentDAO;

	@Override
	@Transactional
	public List<Department> getDepartment() {
		return departmentDAO.getDepartment();
	}
	
	@Override
	@Transactional
	public void saveDepartment(Department theDepartment) {
		departmentDAO.saveDepartment(theDepartment);
	}

	@Override
	@Transactional
	public Department getDepartment(int theId) {
		return departmentDAO.getDepartment(theId);
	}

	@Override
	@Transactional
	public void deleteDepartment(int theId) {
		departmentDAO.deleteDepartment(theId);
		}
	}
