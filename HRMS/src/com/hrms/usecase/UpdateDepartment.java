package com.hrms.usecase;

import java.util.Scanner;

import com.hrms.dao.AdminDaoImpl;

public class UpdateDepartment {

	public void updateDept() {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter new Department Name");
		String deptname = s.nextLine();

		AdminDaoImpl adi = new AdminDaoImpl();
		System.out.println(adi.updateDepartment(deptname));

	}
}
