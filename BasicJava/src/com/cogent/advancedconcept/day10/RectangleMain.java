package com.cogent.advancedconcept.day10;

class Rectangle {
	int length;
	int breadth;
	int area;
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.area = length * breadth;
	}
	
	public String toString() {
		return "Rectangle [length : " + length + ", breadth : " + breadth+ ", Area : " + area + " ]";
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle rect = (Rectangle) obj;
			if((length == rect.length) && (breadth == rect.breadth) && (area == rect.area)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}

}
public class RectangleMain {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(3,5);
		Rectangle r2 = new Rectangle(4,6);
		Rectangle r3 = new Rectangle(3,5);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		System.out.println(r1.equals(r2));
		System.out.println(r1.equals(r3));
	}
}
