/**
 * 
 */
package com.cogent.advancedconcept.day11.lambda;

import java.util.Date;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author : Natanim
 *
 * @date : Jan 23, 2023
 */
public class ConsumerSupplier {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Supplier<Date> date = () -> new Date();
		System.out.println(date.get());
		
		Consumer <String> greet = (myname) -> System.out.println("Greetings, my name is " + myname);
		System.out.println("Enter your name");
		String name1 = sc.next();
		greet.accept(name1);
	}
}
