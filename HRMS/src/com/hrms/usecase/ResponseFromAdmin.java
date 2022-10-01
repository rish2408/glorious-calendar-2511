package com.hrms.usecase;

import com.hrms.dao.EmployeeDao;
import com.hrms.dao.EmployeeDaoImpl;

public class ResponseFromAdmin {

	int id;

	public ResponseFromAdmin() {

	}

	public ResponseFromAdmin(int id) {
		super();
		this.id = id;
	}

	public void response() {

		EmployeeDao ed = new EmployeeDaoImpl();
		String res = ed.leaveResponse(id);
		System.out.println(res);
	}
}
