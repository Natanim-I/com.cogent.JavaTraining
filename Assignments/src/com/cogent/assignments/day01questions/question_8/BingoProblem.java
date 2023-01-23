/**
 * 
 */
package com.cogent.assignments.day01questions.question_8;

/**
 * @author: Natanim
 *
 * @date: Jan 11, 2023
 */
import java.util.*;
public class BingoProblem {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int Array[] = {7,18,24,32,29};
		boolean isFound = false;
		 System.out.println("Insert the first number");
		 int firstNum = Sc.nextInt();
		 while(firstNum < 5 || firstNum > 40) {
			 System.out.println("Enter a number between 5 and 40");
			 firstNum = Sc.nextInt();
		 }
		 System.out.println("Insert the second number");
		 int secondNum = Sc.nextInt();
		 while(secondNum < 5 || secondNum > 40) {
			 System.out.println("Enter a number between 5 and 40");
			 secondNum = Sc.nextInt();
		 }
		 System.out.println("Your first number is : "+ firstNum);
		 System.out.println("Your second number is : "+ secondNum);
		 for(int i = 0; i<Array.length; i++) {
			 if(firstNum == Array[i]) {
				 for(int j =0; j<Array.length; j++) {
					 if(secondNum == Array[j]) {
						 System.out.println("Bingo!!!");
						 isFound = true;
					 }
				 }
			 }
		 }
		 if(!isFound) {
			 System.out.println("Not Found!!!");
		 }
	}

}
