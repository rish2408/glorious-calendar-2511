package com.hrms.dao;

import com.hrms.bean.Employee;
import com.hrms.exception.EmployeeException;

public interface EmployeeDao {

	public Employee loginForEmployee(String pass, String email) throws EmployeeException;
}
