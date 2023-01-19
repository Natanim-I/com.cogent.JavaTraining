/**
 * 
 */
package com.cogent.day03;

/**
 * @author: Natanim
 *
 * @date: Jan 11, 2023
 */
import java.util.*;
public class ProductMenu {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int choice = 0;

		do {
			System.out.println("1 - Create");
			System.out.println("2 - Read");
			System.out.println("3 - Update");
			System.out.println("4 - Delete");
			System.out.println("5 - Exit");
			System.out.println("Please insert your choice");
			choice = Sc.nextInt();
		} while(choice != 5);
		
		switch(choice){
		case 1:
			System.out.println("How many datas you want to create");
			int size;
			size = Sc.nextInt();
			
		}
	}

}