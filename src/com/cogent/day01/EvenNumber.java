/**
 * 
 */
package com.cogent.day01;

import java.util.Scanner;

/**
 * @author: Natanim
 *
 * @date: Jan 10, 2023
 * 
 * A program to print Even numbers that are less than a given number from the user input
 */
public class EvenNumber {

	public static void main(String[] args) {
		
		int num;
		Scanner Sc = new Scanner(System.in);
		System.out.println("Insert a number");
		num = Sc.nextInt();
		for(int i =0; i<= num; i++) {
			if(i%2 == 0) {
				System.out.println("Even number: " + i);
			}
		}
	}

}
