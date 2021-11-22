package com.ankitsolutions.departments;

/**
 * Admin department will contain 3 methods of return type String and will not
 * accept any parameter i) departmentName ii) getTodaysWork iii) getWorkDeadline
 * 
 * 
 * @author Ankit Khandwe
 * @Created_On 22-Nov-2021
 */
public class AdminDepartment extends SuperDepartment {
	@Override
	public String departmentName() {
		return "Admin Department";
	}

	@Override
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
}
