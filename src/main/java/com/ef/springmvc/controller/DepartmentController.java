package com.ef.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ef.springmvc.entity.Customer;
import com.ef.springmvc.entity.Department;
import com.ef.springmvc.service.DepartmentService;


@Controller
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	
	@GetMapping("/test")
	public String m1(Model theModel) {
		List<Department> theDepartment = departmentService.getDepartment();
    	theModel.addAttribute("department", theDepartment);
		return "list-department";
	}
//	@GetMapping("/list")
//	public String listDepartment(Model theModel) {
//		List<Department> theDepartment = departmentService.getDepartment();
//		theModel.addAttribute("department", theDepartment);
//		return "list-department";
//	}
	@GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
        Department theDepartment = new Department();
        theModel.addAttribute("department", theDepartment);
        return "department-form";
    }
	 @PostMapping("/saveDepartment")
	    public String saveDepartment(@ModelAttribute("department") Department theDepartment) {
	        departmentService.saveDepartment(theDepartment);
	        return "redirect:/department/list";
	    }
	 @GetMapping("/updateForm")
	    public String showFormForUpdate(@RequestParam("deptName") int theID,
	        Model theModel) {
	        Department theDepartment = departmentService.getDepartment(theID);
	        theModel.addAttribute("department", theDepartment);
	        return "department-form";
	 }
	 @GetMapping("/delete")
	    public String deleteDepartment(@RequestParam("deptName") int theID) {
	        departmentService.deleteDepartment(theID);
	        return "redirect:/department/list";
	    }
	 }

	 