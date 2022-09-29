package com.hrms.utility;

import java.sql.Connection;

public class Demo {

	public static void main(String[] args) {
		Connection conn = DBUtil.connection();
		
		System.out.println(conn);
	}
}
