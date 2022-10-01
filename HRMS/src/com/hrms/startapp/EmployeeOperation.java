package com.hrms.startapp;

public class EmployeeOperation {

	int id;
	String password;
	String email;

	public EmployeeOperation() {
	
	}

	public EmployeeOperation(int id, String password, String email) {
		super();
		this.id = id;
		this.password = password;
		this.email = email;
	}

	public static void employeeOper() {

		System.out.println("employee hello");

	}
}
