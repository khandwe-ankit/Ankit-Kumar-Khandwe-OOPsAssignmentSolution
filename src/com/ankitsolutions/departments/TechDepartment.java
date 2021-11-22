package com.ankitsolutions.departments;

/**
 * Tech department will contain 4 methods of return type String and will not
 * accept any parameter i) departmentName ii) getTodaysWork iii) getWorkDeadline
 * iv) getTechStackInformation
 * 
 * @author Ankit Khandwe
 * @Created_On 22-Nov-2021
 */
public class TechDepartment extends SuperDepartment {
	@Override
	public String departmentName() {
		return "Tech Department ";
	}

	@Override
	public String getTodaysWork() {
		return "Complete coding of module 1";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String getTechStackinformation() {
		return "Core Java";
	}
}
