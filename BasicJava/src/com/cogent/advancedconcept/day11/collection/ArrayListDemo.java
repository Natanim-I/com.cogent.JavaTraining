/**
 * 
 */
package com.cogent.advancedconcept.day11.collection;

/**
 * @author : Natanim
 *
 * @date : Jan 23, 2023
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.setStudent();
		stu.searchName("Nati");
		stu.searchName(1);
		stu.printNames();
		stu.removeName("Nat");
		System.out.println("List after removal");
		stu.printNames();
	}

}
