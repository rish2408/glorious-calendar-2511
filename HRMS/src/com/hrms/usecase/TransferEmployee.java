package com.hrms.usecase;

import com.hrms.dao.AdminDao;
import com.hrms.dao.AdminDaoImpl;

public class TransferEmployee {

	public static void main(String[] args) {

		AdminDao ad = new AdminDaoImpl();
		System.out.println(ad.transferEmployee());

	}
}
