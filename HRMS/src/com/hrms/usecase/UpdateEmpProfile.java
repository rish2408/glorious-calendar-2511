package com.hrms.usecase;

import com.hrms.dao.EmployeeDao;
import com.hrms.dao.EmployeeDaoImpl;
import com.hrms.startapp.AdminOrEmployee;

public class UpdateEmpProfile {

	static int id;

	public UpdateEmpProfile() {
		// TODO Auto-generated constructor stub
	}

	public UpdateEmpProfile(int id) {
		this.id = id;
	}

	public static void updateProfile() {

		EmployeeDao ed = new EmployeeDaoImpl();
		String res = ed.updateProfile(id);
		System.out.println(res);
		if (res.equals("Updated successfully!")) {
			AdminOrEmployee.choice();
		}

	}
}
