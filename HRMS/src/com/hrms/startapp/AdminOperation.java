package com.hrms.startapp;

import com.hrms.usecase.AddDepartment;
import com.hrms.usecase.AddEmployee;
import com.hrms.usecase.GetAllDepartments;
import com.hrms.usecase.GetAllEmployee;
import com.hrms.usecase.GetAllLeaves;
import com.hrms.usecase.LeaveRespond;
import com.hrms.usecase.TransferEmployee;
import com.hrms.usecase.UpdateAdminProfile;
import com.hrms.usecase.UpdateDepartment;
import com.hrms.usecase.Verify;

public class AdminOperation {

	String pass;
	String email;

	public AdminOperation() {

	}

	public AdminOperation(String pass, String email) {
		super();
		this.pass = pass;
		this.email = email;
	}

	public void adminOper() {

		int choice = Integer.parseInt(Verify.checkChoicesForAdmin());

		switch (choice) {
		case 1: {
			UpdateAdminProfile uaf = new UpdateAdminProfile(pass, email);
			uaf.updateProfile();
			adminOper();
			break;
		}
		case 2: {
			AddEmployee ae = new AddEmployee();
			ae.addemp();
			adminOper();
			break;
		}
		case 3: {
			TransferEmployee te = new TransferEmployee();
			te.transferEmp();
			adminOper();
			break;
		}
		case 4: {
			GetAllEmployee gae = new GetAllEmployee();
			gae.allEmp();
			adminOper();
			break;
		}
		case 5: {
			AddDepartment ad = new AddDepartment();
			ad.addDepartment();
			adminOper();
			break;
		}
		case 6: {
			UpdateDepartment ud = new UpdateDepartment();
			ud.updateDept();
			adminOper();
			break;
		}
		case 7: {
			GetAllDepartments gad = new GetAllDepartments();
			gad.getAllDept();
			adminOper();
			break;
		}
		case 8: {
			GetAllLeaves gal = new GetAllLeaves();
			gal.getAllLeaves();
			adminOper();
			break;
		}
		case 9: {
			LeaveRespond lr = new LeaveRespond();
			lr.leaveRespond();
			adminOper();
			break;
		}
		case 10: {
			AdminOrEmployee.choice();
			break;
		}
		case 11: {
			return;

		}
		default:
			System.out.println("Please Press Valid Number");
			System.out.println("==========================");
			adminOper();
			break;
		}

	}
}
