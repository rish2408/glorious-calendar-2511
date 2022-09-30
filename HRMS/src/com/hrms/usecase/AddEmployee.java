package com.hrms.usecase;

import java.util.Scanner;

import com.hrms.bean.Employee;
import com.hrms.dao.AdminDaoImpl;

public class AddEmployee {

public static void main(String[] args) {
		
		AdminDaoImpl adi = new AdminDaoImpl();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Employee Name ");
		String name = s.nextLine();
		String salary = Verify.checkSalary();
		System.out.println("Enter Employee Role");
		String role = s.nextLine();
		String deptid = Verify.checkDeptid();
		String password = Verify.checkPassword();
		String email =  Verify.checkEmail();
		Employee emp = new Employee(name, salary, role, password, email,deptid);
		String res = adi.addEmployee(emp);
		System.out.println(res);
		
	}
}
