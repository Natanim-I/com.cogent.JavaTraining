/**
 * 
 */
package com.cogent.controller;

/**
 * @author: Natanim
 *
 * @date: Jan 18, 2023
 */
import java.util.Scanner;
import com.cogent.service.*;

public class CustomerController {
	CustomerService cs;
	Scanner sc = new Scanner(System.in);
	public CustomerController() {
		cs = new CustomerService();
	}
	public void accept(int choice) {
		switch(choice) {
		case 1:
			cs.save();
			break;
		case 2:
			cs.fetch();
			break;
		case 3:
			System.out.println("Enter the customer id");
			String cid = sc.next();
			cs.modify(cid);
			break;
		case 4:
			System.out.println("Enter the customer id");
			String id = sc.next();
			cs.remove(id);
			break;
		case 5:
			System.out.println("Enter the customer id");
			String cfid = sc.next();
			cs.search(cfid);
			break;
		case 6:
			cs.young();
			break;
		default:
			System.out.println("Wrong Input!");
			break;
		}
	}
}
