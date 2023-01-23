/**
 * 
 */
package com.cogent.advancedconcept.day10;

/**
 * @author : Natanim
 *
 * @date : Jan 20, 2023
 */
public class Person implements Drawable {
	
	public boolean hasBeenDrawn() {
		return true;
	}
	
	public void draw() {
		System.out.println("The person's class draw method");
	}
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.draw();
		//p1.drawQuote();
	}
}
