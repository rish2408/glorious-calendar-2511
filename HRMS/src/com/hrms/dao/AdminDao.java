package com.hrms.dao;

import com.hrms.bean.Admin;
import com.hrms.bean.Employee;
import com.hrms.exception.AdminException;

public interface AdminDao {

	public String updateProfile(Admin admin);

	public Admin loginForAdmin(String pass, String email) throws AdminException;

	public String addEmployee(Employee employee);
}
