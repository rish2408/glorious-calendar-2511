package com.hrms.usecase;

import com.hrms.dao.EmployeeDao;
import com.hrms.dao.EmployeeDaoImpl;

public class ApplyForLeave {

	int id;

	public ApplyForLeave() {

	}

	public ApplyForLeave(int id) {
		super();
		this.id = id;
	}

	public void forLeave() {

		EmployeeDao ed = new EmployeeDaoImpl();
		String res = ed.applyForLeave(id);
		System.out.println(res);

	}
}
