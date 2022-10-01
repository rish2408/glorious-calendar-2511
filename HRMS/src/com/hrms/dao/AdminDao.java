package com.hrms.dao;

import java.util.List;

import com.hrms.bean.Admin;
import com.hrms.bean.Department;
import com.hrms.bean.Employee;
import com.hrms.bean.Leave;
import com.hrms.exception.AdminException;
import com.hrms.exception.DepartmentException;
import com.hrms.exception.EmployeeException;
import com.hrms.exception.LeaveException;

public interface AdminDao {

	public String updateProfile(Admin admin);

	public Admin loginForAdmin(String pass, String email) throws AdminException;

	public String addEmployee(Employee employee);

	public String addDepartment(String deptid, String deptName);

	public String updateDepartment(String depName);

	public String transferEmployee();

	public List<Department> getAllDepartments() throws DepartmentException;

	public List<Employee> getAllEmployees() throws EmployeeException;

	public List<Leave> getAllLeavesRequest() throws LeaveException;
	
	public void respontToLeaveRequest();
}
