/**
 * 
 */
package com.cogent.advancedconcept.day11.lambda;

import java.util.Scanner;

/**
 * @author : Natanim
 *
 * @date : Jan 23, 2023
 */
public class SumImpl {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int y = sc.nextInt();
		
		Sum sum1 = (int a)-> System.out.println("The square of the numbers is : "+(a*a));
		sum1.square(y);
	}
}
