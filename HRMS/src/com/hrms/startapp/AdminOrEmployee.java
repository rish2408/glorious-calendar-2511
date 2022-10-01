package com.hrms.startapp;

import java.util.List;
import java.util.Scanner;

import com.hrms.bean.Admin;
import com.hrms.bean.Department;
import com.hrms.bean.Employee;
import com.hrms.bean.Leave;
import com.hrms.dao.AdminDao;
import com.hrms.dao.AdminDaoImpl;
import com.hrms.dao.EmployeeDao;
import com.hrms.dao.EmployeeDaoImpl;
import com.hrms.exception.AdminException;
import com.hrms.exception.DepartmentException;
import com.hrms.exception.EmployeeException;
import com.hrms.exception.LeaveException;
import com.hrms.usecase.Verify;

public class AdminOrEmployee {

	public static void choice() {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("1.Admin \n2.Employee");
			System.out.println("Choose your option");
			int choice = sc.nextInt();

			switch (choice) {

			case 1: {
				
				String email = Verify.checkemail();
				String pass = Verify.checkPass();				

				try {
					
					AdminDao adi = new AdminDaoImpl();
					Admin admin = adi.loginForAdmin(pass, email);
					
					System.out.println(" Welcome  --> "+admin.getName());
					System.out.println("================================");
					AdminOperation ao = new AdminOperation(pass,email);
					ao.adminOper();

				} catch (AdminException e) {
					System.out.println(e.getMessage());

				}
			}

				break;
			case 2:
			{	
				System.out.println("USER-LOGIN");

				String email = Verify.checkemail();
				String pass = Verify.checkPass();
				try {
					
					EmployeeDao ed = new EmployeeDaoImpl();
					Employee employee = ed.loginForEmployee(pass, email);
					
					
					System.out.println("Welcome --> "+employee.getEmpName() +"   Id is -->  "+employee.getEmpId());
					System.out.println("========================================================================");
					EmployeeOperation eo = new EmployeeOperation(employee.getEmpId(), pass, email);
					eo.employeeOper();
					
				} catch (EmployeeException e) {
					System.out.println(e.getMessage());
					choice();
					
				}
			}	
				break;
			default :
			System.out.println("Please Press Valid Number");
			System.out.println("=========================");
			choice();
			break;
			}

		} catch (Exception e) {
			System.out.println("Please Enter Only Number");
			System.out.println("=========================");
			choice();
		}

	}
}
