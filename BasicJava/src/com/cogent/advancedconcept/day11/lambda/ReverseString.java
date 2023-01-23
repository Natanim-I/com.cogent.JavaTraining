/**
 * 
 */
package com.cogent.advancedconcept.day11.lambda;

import java.util.Scanner;
import java.util.function.Function;

/**
 * @author : Natanim
 *
 * @date : Jan 23, 2023
 */
public class ReverseString {
	public static void main(String[] args) {
		Function<String, String> reverse = (str) -> {
			String rev="";
			char ch;
			for(int i=0; i<str.length(); i++) {
				ch = str.charAt((str.length()-1)-i);
				rev = rev+ch;
			}
			return rev;
		};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str1 = sc.next();
		System.out.println("The reverse string is : " + reverse.apply(str1));
	}
}
