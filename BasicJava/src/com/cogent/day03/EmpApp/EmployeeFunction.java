/**
 * 
 */
package com.cogent.day03.EmpApp;

/**
 * @author: Natanim
 *
 * @date: Jan 11, 2023
 */
import java.util.*;
public class EmployeeFunction {
	public static void create(Employee emp[], int size) {
		Scanner Sc = new Scanner(System.in);
		for(int i=0; i<emp.length; i++) {
			Employee emp1 = new Employee();
			System.out.println("Enter employee number");
			int empNo = Sc.nextInt();
			System.out.println("Enter employee name");
		    String empName = Sc.next();
			System.out.println("Enter employee salary");
			double empSal = Sc.nextDouble();
			
			emp1.setEmployeeId(empNo);
			emp1.setEmployeeName(empName);
			emp1.setEmployeeSalary(empSal);
			
			emp[i] = emp1;
		}
		System.out.println("Record created succesfully!!!");
	}
	
	public static void read(Employee emp[]) {
		for(int i = 0; i<emp.length; i++) {
			System.out.println("Id : " + emp[i].getEmployeeId());
			System.out.println("Name : " + emp[i].getEmployeeName());
			System.out.println("Salary : " + emp[i].getEmployeeSalary());
			System.out.println();
		}
	}
	
	public static void update(Employee emp[], int index) {
		Scanner Sc = new Scanner(System.in);
		int employeeIndex = -1;
		while(employeeIndex < 0 || employeeIndex > 2) {
			System.out.println("Insert the index of the employee data you want to update ");
			employeeIndex = Sc.nextInt();
		}
		if(employeeIndex == 0) {
			System.out.println("Insert the index : ");
			int newId = Sc.nextInt();
			emp[index].setEmployeeId(newId);
		} else if(employeeIndex == 1) {
			System.out.println("Insert Name : ");
			String newName = Sc.next();
			emp[index].setEmployeeName(newName);
		} else {
			System.out.println("Insert Salary : ");
			double newSal = Sc.nextDouble();
			emp[index].setEmployeeSalary(newSal);
		}
		System.out.println("Employee Data Updated!!!");
	}
	
	public static void delete(Employee emp[], int deleteIndex) {
		for(int i = 0; i < emp.length; i++) {
			if(i == deleteIndex) {
				emp[i] = emp[i+1];
			}
			if (i > deleteIndex && i < emp.length-1)
            {
                emp[i] = emp[i+1];
            }
		}
		emp[emp.length-1] = null;   
		System.out.println("Deleted!!!");
	}
}
