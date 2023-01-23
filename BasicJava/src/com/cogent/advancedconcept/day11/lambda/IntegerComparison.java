/**
 * 
 */
package com.cogent.advancedconcept.day11.lambda;

import java.util.Scanner;
import java.util.function.Predicate;

/**
 * @author : Natanim
 *
 * @date : Jan 23, 2023
 */
public class IntegerComparison {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num1 = sc.nextInt();
		Predicate<Integer> number = (num) -> (num>=20);
		if(number.test(num1)) {
			System.out.println(num1 + " is greater than 20");
		} else {
			System.out.println("Not greater than 20!");
		}
	}
}
