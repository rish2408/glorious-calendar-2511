package com.hrms.usecase;

import com.hrms.dao.AdminDao;
import com.hrms.dao.AdminDaoImpl;

public class LeaveRespond {

	public void leaveRespond() {

		AdminDao ad = new AdminDaoImpl();
		ad.respontToLeaveRequest();

	}

}
