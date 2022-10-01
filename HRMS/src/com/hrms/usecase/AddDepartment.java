package com.hrms.usecase;

import java.util.Scanner;

import com.hrms.dao.AdminDaoImpl;

public class AddDepartment {

	public void addDepartment() {

		Scanner s = new Scanner(System.in);
		String deptid = Verify.checkDeptid();
		System.out.println("Enter department Name");
		String deptName = s.nextLine();

		AdminDaoImpl adi = new AdminDaoImpl();
		String res = adi.addDepartment(deptid, deptName);
		System.out.println(res);

	}
}
