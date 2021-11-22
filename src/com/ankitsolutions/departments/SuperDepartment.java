package com.ankitsolutions.departments;

/**
 * Super Department class will be the superclass and all other departments must
 * extend it. i) departmentName ii) getTodaysWork iii) getWorkDeadline iv)
 * isTodayAHoliday
 * 
 * 
 * @author Ankit Khandwe
 * @Created_On 22-Nov-2021
 */
public class SuperDepartment {

	public String departmentName() {
		return "Super Department";
	}

	public String getTodaysWork() {
		return "No Work as of now";
	}

	public String getWorkDeadline() {
		return "Nil";
	}

	public String isTodayAHoliday() {
		return "Today is not a holiday";
	}

}
