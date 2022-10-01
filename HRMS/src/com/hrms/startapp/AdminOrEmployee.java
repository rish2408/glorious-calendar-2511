package com.hrms.startapp;

import java.util.List;
import java.util.Scanner;

import com.hrms.bean.Admin;
import com.hrms.bean.Department;
import com.hrms.bean.Employee;
import com.hrms.bean.Leave;
import com.hrms.dao.AdminDao;
import com.hrms.dao.AdminDaoImpl;
import com.hrms.dao.EmployeeDao;
import com.hrms.dao.EmployeeDaoImpl;
import com.hrms.exception.AdminException;
import com.hrms.exception.DepartmentException;
import com.hrms.exception.EmployeeException;
import com.hrms.exception.LeaveException;
import com.hrms.usecase.Verify;

public class AdminOrEmployee {

	public static void choice() {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("1.Admin \n2.Employee");
			System.out.println("Choose your option");
			int choice = sc.nextInt();

			switch (choice) {

			case 1: {
				System.out.println("ADMIN-LOGIN");
				System.out.println("Enter Your Email");
				String email = sc.next();
				System.out.println("Enter your Password");
				String pass = sc.next();
				AdminDao adi = new AdminDaoImpl();

				try {
					Admin admin = adi.loginForAdmin(pass, email);

					System.out.println("Welcome " + admin.getName());

					Boolean v = true;
					while (v) {
						System.out.println("1.ADD DEPARTMENT\r\n" + "2.VIEW ALL DEPARTMENTS\r\n" + " 3.UPDATE DEPARTMENT\r\n"
								+ " 4.REGISTER NEW EMPLOYEE \r\n" + "5.TRANSFER EMPLOYEE TO DEPARTMENTS\r\n"
								+ " 6.GRANT LEAVE \r\n" + "7.ADMIN LOGOUT\r\n" + "");

						int x = sc.nextInt();
						if (x == 1) {
							String a1 = Verify.checkDeptid();
							System.out.println("Enter Department Name");
							String a2 = sc.next();

							String s1 = adi.addDepartment(a1, a2);
							if (s1 != null) {
								System.out.println(s1);
							}

						}
						if (x == 2) {
							try {
								List<Department> list  = adi.getAllDepartments();
								if (list.size() != 0) {

									for (Department d : list) {

										System.out.println("Department Id is :  " + d.getDepId());
										System.out.println("Department Name is :  " + d.getDepName());
										System.out.println("=======================================");

									}

								}
							} catch (DepartmentException e) {
								e.printStackTrace();
							}

						}
						if (x == 3) {
							System.out.println("Give New Department Name");
							String u1 = sc.next();
							System.out.println(adi.updateDepartment(u1));
						}
						if (x == 4) {

							System.out.println("Enter Employee Name ");
							String name = sc.next();
							String salary = Verify.checkSalary();
							System.out.println("Enter Employee Role");
							String role = sc.next();
							String deptid = Verify.checkDeptid();
							String password = Verify.checkPassword();
							String nemail =  Verify.checkEmail();
							Employee emp = new Employee(name, salary, role, password, nemail,deptid);

							String result = null;
							result = adi.addEmployee(emp);
							if (!result.equals(null)) {
								System.out.println(result);
							}
						}
						if (x == 5) {
							System.out.println(adi.transferEmployee());
						}
						if (x == 6) {
							try {
								List<Leave> list = adi.getAllLeavesRequest();

								for (Leave l : list) {
									System.out.println("Leave Number is :  " + l.getLeaveNum());
									System.out.println("Employee Id is :  " + l.getEmpId());
									System.out.println("Employee Name is :  " + l.getName());
									System.out.println("Leave Duration in days :  " + l.getDuration());
									System.out.println("Leave Reason :  " + l.getReason());
									System.out.println("=================================================");
								}

							} catch (LeaveException e) {
								System.out.println(e.getMessage());
							}
						}
						if (x == 7) {
							v = false;
							System.out.println("ADMIN LOGOUT");
						}
					}

				} catch (AdminException e) {
					System.out.println(e.getMessage());

				}
			}

				break;
			case 2:

				System.out.println("Employee");

				System.out.println("Enter your password");
				String pass = sc.nextLine();
				System.out.println("Enter your email");
				String email = sc.nextLine();

				try {

					EmployeeDao ed = new EmployeeDaoImpl();
					Employee employee = ed.loginForEmployee(pass, email);

					System.out.println("Welcome " + employee.getEmpName());
					EmployeeOperation.employeeOper();

				} catch (EmployeeException e) {
					System.out.println(e.getMessage());

				}

				break;
			default:
				System.out.println("Please enter valid number");
				break;
			}

		} catch (Exception e) {
			System.out.println("Please enter Number");
		}

	}
}
