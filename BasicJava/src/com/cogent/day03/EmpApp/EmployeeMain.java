/**
 * 
 */
package com.cogent.day03.EmpApp;

import java.util.Scanner;

/**
 * @author: Natanim
 *
 * @date: Jan 11, 2023
 */
import java.util.*;
public class EmployeeMain {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int choice = 0;
		Employee emp[] = null;

		do {
			System.out.println("1 - Create");
			System.out.println("2 - Read");
			System.out.println("3 - Update");
			System.out.println("4 - Delete");
			System.out.println("5 - Exit");
			System.out.println("Please insert your choice");
			choice = Sc.nextInt();
			
			switch(choice){
			case 1:
				System.out.println("How many datas you want to create");
				int size = Sc.nextInt();
				emp = new Employee[size];
				EmployeeFunction.create(emp,size);
				break;
			case 2:
				EmployeeFunction.read(emp);
				break;
			case 3:
				int index = -1;
				while(index < 0 || index >= emp.length) {
					System.out.println("Insert the index of the employee : ");
					index = Sc.nextInt();
				}
				EmployeeFunction.update(emp, index);
				break;
			case 4:
				int deleteIndex = -1;
				while(deleteIndex < 0 || deleteIndex >= emp.length) {
					System.out.println("Insert the index of the employee to be deleted : ");
					deleteIndex = Sc.nextInt();
				}
				EmployeeFunction.delete(emp, deleteIndex);
				break;
			case 5:
				System.out.println("Hope you enjoyed my program!!!");
				break;
			default:
				System.out.println("Incorrect input");
				break;
			}
		} while(choice != 5);
	}
}
