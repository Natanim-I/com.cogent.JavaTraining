/**
 * 
 */
package com.cogent.assignments.day01questions.question_1;

/**
 * @author : Natanim
 *
 * @date : Jan 20, 2023
 * 
 * This is a program to list all even numbers less than or equal to a given number.
 * The program takes the number from user as input.
 * 
 */
import java.util.Scanner;

public class ListEvenNumbers_1 {
	public static void main(String[] args) {
		ListEvenNumbers_1 listEven = new ListEvenNumbers_1();
		try {
			int number = listEven.inputNumber(); // call to the inputNumber method
			listEven.printEven(number); //call to the printEven method
		}catch(Exception inputException) {
			System.out.println("InputMisMatchException caugth!");
			System.out.println("Please insert numeric value only!");
		}
		
	}
	public int inputNumber() throws Exception { // method to accept a user input
		int number;
			System.out.println("Enter a number : ");
			Scanner sc = new Scanner(System.in);
			number = sc.nextInt(); //accepting user input and assigning it to variable number
		return number;
	}
	
	public void printEven(int number) {  // method to print the even numbers less than the given number
		System.out.println("All the even numbers less than or equal to " + number);
		for(int i=0; i<=number; i++) {
			if(i%2 == 0) {
				System.out.print(i+ ", ");
			}
		}
		
	}
}
