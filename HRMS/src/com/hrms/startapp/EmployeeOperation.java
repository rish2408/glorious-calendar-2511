package com.hrms.startapp;

import com.hrms.usecase.ApplyForLeave;
import com.hrms.usecase.EmpViewProfile;
import com.hrms.usecase.ResponseFromAdmin;
import com.hrms.usecase.UpdateEmpProfile;
import com.hrms.usecase.Verify;

public class EmployeeOperation {

	static int id;
	static String password;
	static String email;

	public EmployeeOperation() {
	
	}

	public EmployeeOperation(int id, String password, String email) {
		super();
		this.id = id;
		this.password = password;
		this.email = email;
	}

	public static void employeeOper() {

		int choice = (Integer.parseInt(Verify.checkChoicesForEmp()));

		switch (choice) {
		case 1: {
			EmpViewProfile evp = new EmpViewProfile(id);
			evp.viewProfile();
			employeeOper();
			break;
		}
		case 2: {
			UpdateEmpProfile uep = new UpdateEmpProfile(id);
			uep.updateProfile();
			employeeOper();
			break;
		}
		case 3: {

			ApplyForLeave afl = new ApplyForLeave(id);
			afl.forLeave();
			employeeOper();
			break;
		}
		case 4: {

			ResponseFromAdmin rfa = new ResponseFromAdmin(id);
			rfa.response();
			employeeOper();
			break;
		}
		case 5: {
			AdminOrEmployee.choice();
			break;
		}
		case 6: {
			return;

		}
		default:
			System.out.println("Please Press Valid Number");
			System.out.println("==========================");
			employeeOper();
		}

	}
}
