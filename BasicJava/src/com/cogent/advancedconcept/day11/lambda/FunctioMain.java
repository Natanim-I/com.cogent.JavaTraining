/**
 * 
 */
package com.cogent.advancedconcept.day11.lambda;

import java.util.Scanner;
import java.util.function.Function;
import java.math.*;

/**
 * @author : Natanim
 *
 * @date : Jan 23, 2023
 */
public class FunctioMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		double radius = sc.nextDouble();
		Function<Double, Double> calculator = num -> (Math.PI*num*num);
		System.out.println("The area of the circle is : " + calculator.apply(radius));		
	}
}
