package com.hrms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hrms.bean.Employee;
import com.hrms.exception.EmployeeException;
import com.hrms.utility.DBUtil;

public class EmployeeDaoImpl implements EmployeeDao{
	
	public Employee loginForEmployee(String pass, String email) throws EmployeeException{
		
		Employee employee = null;
		
		try(Connection conn = DBUtil.connection()) {
			
			PreparedStatement ps = conn.prepareStatement("SELECT * from employee WHERE empPassword like binary  ? AND empEmail = ?");
			
			ps.setString(1, pass);
			ps.setString(2, email);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				int id = rs.getInt("empId");
				String n = rs.getString("empName");
				String p = rs.getString("empPassword");
				String e = rs.getString("empEmail");
				
				
				employee = new Employee(id,n, pass, email);
			}else {
				
				throw new EmployeeException("Invalid Password or Email...");
			}
			
			
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		
		return employee;
	}
}
