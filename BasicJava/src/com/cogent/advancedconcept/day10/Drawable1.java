/**
 * 
 */
package com.cogent.advancedconcept.day10;

/**
 * @author : Natanim
 *
 * @date : Jan 20, 2023
 */
enum Unit{pixel,inch,milimeter};

public interface Drawable1 {
	public default void draw() {
		System.out.println("The Drawable Interface's draw method");
	}
	
	public static Unit getStandardUnit() {
		return pixel;
	}
}
