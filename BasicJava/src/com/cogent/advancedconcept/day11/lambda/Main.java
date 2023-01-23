/**
 * 
 */
package com.cogent.advancedconcept.day11.lambda;

/**
 * @author : Natanim
 *
 * @date : Jan 23, 2023
 */
public class Main {

	public static void main(String[] args) {
		MyInterface mi = ()-> System.out.println("MyInterface has been called!");
		mi.method1();
	}

}
