/**
 * 
 */
package com.cogent.day05;

/**
 * @author: Natanim
 *
 * @date: Jan 16, 2023
 */
public class Vowels {
	public static void main(String[] args) {
		String name = "cogent infotech";
		for(int i =0; i<name.length(); i++) {
			if(name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u') {
				System.out.println(name.charAt(i));
			}
		}
	}

}
