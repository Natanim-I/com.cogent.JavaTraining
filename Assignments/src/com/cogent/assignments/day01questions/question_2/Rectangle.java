/**
 * 
 */
package com.cogent.assignments.day01questions.question_2;

/**
 * @author : Natanim
 *
 * @date : Jan 20, 2023
 * 
 * Aprogram to calculate area, perimeter of a rectangle, it also displays the information of the rectangle
 */

public class Rectangle{
	private double length;
	private double breadth;
	
	public Rectangle() {
		super();
		this.length = 0;
		this.breadth = 0;
	}
	
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setBreadtg(double breadth) {
		this.breadth = breadth;
	}
	
	public double getBreadth() {
		return breadth;
	}
	
	public double calculateArea(double length, double breadth) { //method to calculate area
		return length * breadth;
	}
	
	public double calculatePerimeter(double length, double breadth) {  // method to calculate perimeter
		return (2 * (length+breadth)); 
	}
	public void showRectangleInfo() {  // method to display information of a rectangle
		System.out.println("This is rectangle has the following proprties : ");
		System.out.println("Length : " + length);
		System.out.println("Breadth : "+ breadth);
		System.out.println("Area : " + calculateArea(length,breadth));
		System.out.println("Perimeter : " + calculatePerimeter(length,breadth));
		System.out.println();
	}
}