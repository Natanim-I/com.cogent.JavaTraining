/**
 * 
 */
package com.cogent.dao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 * @author: Natanim
 *
 * @date: Jan 18, 2023
 */
import java.util.Scanner;

import com.cogent.exceptions.MandatoryFieldException;
import com.cogent.model.*;

import pkg.cogent.exception.MandatoryFieldExcpetion;
import pkg.cogent.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {
	Customer customers[];
	Scanner sc = new Scanner(System.in);
	@Override
	public void create() {
		System.out.println("How many customers you want to add : ");
		int size = sc.nextInt();
		customers = new Customer[size];
		
		for(int i = 0; i<customers.length; i++) {
			Customer cust = new Customer();
			System.out.println("Enter customer id : ");
			String cid = sc.next();
			System.out.println("Enter customer name : ");
			String cName = sc.next();
			System.out.println("Enter customer email : ");
			String cEmail = sc.next();
			System.out.println("Enter customer date of birth(dd-mm-yyyy) : ");
			String cDob = sc.next();
			
			cust.setcId(cid);
			cust.setcName(cName);
			cust.setcEmail(cEmail);
			cust.setcDOB(cDob);
			
			customers[i] = cust;
		}
	}

	@Override
	public void read() {
		for(int i = 0; i<customers.length; i++) {
			System.out.println("Customer id : " + customers[i].getcId());
			System.out.println("Customer name : " + customers[i].getcName());
			System.out.println("Customer email : " + customers[i].getcEmail());
			System.out.println("Customer date of birth : " + customers[i].getcDOB());
			System.out.println();
		}
	}

	@Override
	public void update(String cid) {
		boolean isFound = false;
		for(int i=0; i<customers.length; i++) {
			if(cid.equals(customers[i].getcId())) {
				isFound = true;
				int choice=1;
				while(choice <1 || choice >4) {
					System.out.println("Enter correct choice option : ");
					choice = sc.nextInt();
				}
				System.out.println("*******Update Menu*********");
				System.out.println("1 - To update customer id");
				System.out.println("2 - To update customer name");
				System.out.println("3 - To update customer email");
				System.out.println("4 - To update customer date of birth");
				System.out.println("Enter your choice : ");
				choice = sc.nextInt();

				if(choice == 1) {
					System.out.println("Update the customer id : ");
					String updateId = sc.next();
					customers[i].setcId(updateId);
					System.out.println("Update successful!");
				} else if(choice == 2) {
					System.out.println("Update the customer name : ");
					String updateName = sc.next();
					customers[i].setcName(updateName);
					System.out.println("Update successful!");
				} else if(choice == 3) {
					System.out.println("Update the customer email : ");
					String updateEmail = sc.next();
					customers[i].setcEmail(updateEmail);
					System.out.println("Update successful!");
				} else {
					System.out.println("Update the customer date of birth : ");
					String updateDob = sc.next();
					customers[i].setcDOB(updateDob);
					System.out.println("Update successful!");
				}
			}
		}
		if(!isFound) {
			System.out.println("Id doesn't match!");
		}
	}

	@Override
	public void delete(String id) {
		boolean isFound = false;
		for(int i=0; i<customers.length; i++) {
			if(id.equals(customers[i].getcId())) {
				isFound = true;
				customers[i].setcId(null);
				customers[i].setcName(null);
				customers[i].setcEmail(null);
				customers[i].setcDOB(null);
				
				System.out.println("Customer record deleted!");
			}
		}
		if(!isFound) {
			System.out.println("Id doesn't match!");
		}
	}

	@Override
	public void findById(String cfid) {
		boolean isFound = false;
		for(int i=0; i<customers.length; i++) {
			if(cfid.equals(customers[i].getcId())) {
				isFound = true;
				System.out.println("**********Customer Found*****************");
				System.out.println("Customer Id : " + customers[i].getcId());
				System.out.println("Customer Name : " + customers[i].getcName());
				System.out.println("Customer E-mail : " + customers[i].getcEmail());
				System.out.println("Customer Date of Birth : " + customers[i].getcDOB());
				System.out.println("*****************************************");
			}
		}
		if(!isFound) {
			System.out.println("No customer with this id!");
		}
	}

	@Override
	public void findYoung() {
		LocalDate dobYoung = LocalDate.parse(customers[0].getcDOB(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		String youngerId = customers[0].getcId();
		String youngerName = customers[0].getcName();
		String youngerEmail = customers[0].getcEmail();
		String youngerDOB = customers[0].getcDOB();
		for(int i =0; i<customers.length; i++) {
			LocalDate dob = LocalDate.parse(customers[i].getcDOB(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			if(dob.isAfter(dobYoung)) {
				youngerId = customers[i].getcId();
				youngerName = customers[i].getcName();
				youngerEmail = customers[i].getcEmail();
				youngerDOB = customers[i].getcDOB();
			}
		}
		System.out.println("*******Younger Customer***********");
		System.out.println("Id : "+ youngerId);
		System.out.println("Name : "+ youngerName);
		System.out.println("Email : "+ youngerEmail);
		System.out.println("Date of birth : "+ youngerDOB);
		System.out.println("***********************************");
	}
	
	public void validateMandatoryField(Customer customer) {
		if(customer==null)
		{
			throw new MandatoryFieldException("Customer object can't be empty");
		}
		else if(customer.getcId()==null)
		{
			throw new MandatoryFieldException("Customer ID can't be empty");
		}
	}


}
