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
public class VoteProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		Predicate<Integer> age1 = (num) -> (num>=20);
		if(age1.test(age)) {
			System.out.println("You are eligable to vote!");
		} else {
			System.out.println("You are not eligable to vote!");
		}
	}
}
