/**
 * 
 */
package com.cogent.day05;

/**
 * @author: Natanim
 *
 * @date: Jan 13, 2023
 */

class Student25{
	String fName;
	String lName;
	String email;
	String country;
	
	Student25(){
		
	}
	
	Student25(String fName, String lName, String email, String country){
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.country = country;
	}
}
public class Manager025 {
	public static void main(String[] args) {
		Student25 s1 = new Student25();
		Student25 s2 = new Student25("Natanim","Issa","natanimissa@gmail.com","Ethiiopia");
	}
}
