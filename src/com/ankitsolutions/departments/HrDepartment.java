package com.ankitsolutions.departments;

/**
 * Hr department will contain 4 methods of return type String and will not
 * accept any parameter i) departmentName ii) getTodaysWork iii) getWorkDeadline
 * iv) doActivity
 * 
 * 
 * @author Ankit Khandwe
 * @Created_On 22-Nov-2021
 */
public class HrDepartment extends SuperDepartment {

	@Override
	public String departmentName() {
		return "Hr Department ";
	}

	@Override
	public String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String doActivity() {
		return "team Lunch";
	}
}
