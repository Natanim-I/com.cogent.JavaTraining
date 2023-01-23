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
public class UpperCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.next();
		System.out.println(str.toUpperCase());
	}
}
