package com.hrms.usecase;

import java.util.List;

import com.hrms.bean.Employee;
import com.hrms.dao.AdminDao;
import com.hrms.dao.AdminDaoImpl;
import com.hrms.exception.EmployeeException;

public class GetAllEmployee {

	public static void main(String[] args) {

		AdminDao ad = new AdminDaoImpl();

		try {
			List<Employee> list = ad.getAllEmployees();

			for (Employee e : list) {

				System.out.println("Employee Id is :  " + e.getEmpId());
				System.out.println("Employee name is :  " + e.getEmpName());
				System.out.println("Employee working in Deparment :  " + e.getDeptId());
				System.out.println("Employee Salary is :  " + e.getEmpSalary());
				System.out.println("Employee role is :  " + e.getEmpRole());
				System.out.println("========================================================");

			}

		} catch (EmployeeException e) {

			System.out.println(e.getMessage());
		}

	}

}
