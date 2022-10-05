package Driver;

import Model.AdminDepartment;
import Model.HrDepartment;
import Model.TechDepartment;

public class Main 
{
// Main method to create objects of departments and show their functionalities
	public static void main(String[] args) {
		// creating objects of department classes
		AdminDepartment admin = new AdminDepartment();
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();

		// Showing Admin class functionality
		System.out.println(admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());

		// Showing Hr department functionality
		System.out.println();
		System.out.println(hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());

		// Showing tech department functionality
        System.out.println();
		System.out.println( tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
	}
}
