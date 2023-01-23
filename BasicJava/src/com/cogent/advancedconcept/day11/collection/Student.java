/**
 * 
 */
package com.cogent.advancedconcept.day11.collection;

/**
 * @author : Natanim
 *
 * @date : Jan 23, 2023
 */
import java.util.*;
public class Student {
	
	private int rollNo;
	private String studentName;
	private int stuAge;
	private String address;
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStuAge() {
		return stuAge;
	}

	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	private ArrayList<Student> student = new ArrayList();
	Scanner sc = new Scanner(System.in);
	
	public void setStudent() {
		System.out.println("How many student you want to insert : ");
		int size = sc.nextInt();
		for (int i =0; i<size; i++) {
			Student stud1 = new Student();
			
			System.out.println("Enter roll no : ");
			int rollNo1 = sc.nextInt();
			System.out.println("Enter name : ");
			String name1 = sc.next();
			System.out.println("Enter age : ");
			int age1 = sc.nextInt();
			System.out.println("Enter address : ");
			String address1 = sc.next();
			
			stud1.setRollNo(rollNo1);
			stud1.setStudentName(name1);
			stud1.setStuAge(age1);
			stud1.setAddress(address1);
			
			student.add(stud1);
		}
		System.out.println();
	}
	
	public void searchName(String key) {
		boolean isFound = false;
		System.out.println("Enter the search key : ");
		key = sc.next();
		for(int i=0; i<student.size(); i++) {
			if(student.get(i).getStudentName().equals(key)) {
				System.out.println("Student found");
				System.out.println("Roll no : " + student.get(i).getRollNo());
				System.out.println("Name : " + student.get(i).getStudentName());
				System.out.println("Age : " + student.get(i).getStuAge());
				System.out.println("Address : " + student.get(i).getAddress());
				System.out.println();
				isFound = true;
			}
		}
		if(!isFound) {
			System.out.println("No object with the specified name!");
		}
	}
	
	public void searchName(int index) {
		boolean isFound = false;
		System.out.println("The student at index " + index + " is : ");
		System.out.println("Student found");
		System.out.println("Roll no : " + student.get(index).getRollNo());
		System.out.println("Name : " + student.get(index).getStudentName());
		System.out.println("Age : " + student.get(index).getStuAge());
		System.out.println("Address : " + student.get(index).getAddress());
		System.out.println();
		isFound = true;

		if(!isFound) {
			System.out.println("No object with the specified name!");
		}
	}
	
	public void printNames() {
		System.out.println("*********************************");
		System.out.println("ArrayList student names display");
		
		Iterator <Student> itr = student.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().getStudentName());
		}
		System.out.println();
	}
	
	public void removeName(String stuName) {
		boolean isFound = false;
		for(int i=0; i<student.size(); i++) {
			if(student.get(i).getStudentName().equals(stuName)) {
				System.out.println("Student found and removed");
				student.remove(i);
				isFound = true;
			}
		}
		if(!isFound) {
			System.out.println("No object with the specified name!");
		}
	}
}
