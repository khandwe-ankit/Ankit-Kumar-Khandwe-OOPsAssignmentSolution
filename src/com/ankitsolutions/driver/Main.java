package com.ankitsolutions.driver;

import com.ankitsolutions.departments.AdminDepartment;
import com.ankitsolutions.departments.HrDepartment;
import com.ankitsolutions.departments.TechDepartment;

/**
 * Driver class Main will be used to create objects of HrDepartment,
 * TechDepartment, AdminDepartment → Each department will display all its
 * functionalities. → Each department will display whether today is a holiday or
 * not with the help of the Super Department. (SuperDepartment will act as a
 * super class for all the departments)
 * 
 * @author Ankit Khandwe
 * @Created_On 22-Nov-2021
 */
public class Main {

	public static void main(String[] args) {

		AdminDepartment admin = new AdminDepartment();
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();

		System.out.println("Welcome to " + admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println();

		System.out.println("Welcome to " + hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println();

		System.out.println("Welcome to " + tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackinformation());
		System.out.println(tech.isTodayAHoliday());
		System.out.println();
	}

}
