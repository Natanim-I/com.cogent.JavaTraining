/**
 * 
 */
package com.cogent.advancedconcept.day10;

/**
 * @author : Natanim
 *
 * @date : Jan 20, 2023
 */
public interface Drawable {
	boolean hasBeenDrawn();
	
	default void draw() {
		System.out.println("The Drawable Interface's draw method");
	}
	
	default void drawQuote() {
		System.out.println("\"The Drawable Interface's drawQuote method\"");
	}
}
