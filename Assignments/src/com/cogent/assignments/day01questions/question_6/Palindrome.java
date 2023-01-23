/**
 * 
 */
package com.cogent.assignments.day01questions.question_6;

/**
 * @author : Natanim
 *
 * @date : Jan 23, 2023
 */
public class Palindrome {
	public static void main(String[] args) {
		boolean isPalindrome = false;
		String str = args[0];
		System.out.println("The length of the string is : "+ str.length());
		for(int i =0; i< str.length(); i++) {
			if(str.charAt(i) == str.charAt((str.length()-1)-i)) {
				isPalindrome = true;
			}
		}
		if(isPalindrome) {
			System.out.println("Palindrome String!");
		}else{
			System.out.println("Not palindrome!");
		}
	}
}
