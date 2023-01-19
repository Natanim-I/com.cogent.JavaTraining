/**
 * 
 */
package com.cogent.day03;

/**
 * @author: Natanim
 *
 * @date: Jan 11, 2023
 */
public class ObjectCreation {
	int i =100;
	static int j = 200;
	
	void test1() {
		System.out.println("I am from test 1");
	}
	static void test2() {
		System.out.println("I am from test2");
	}
	public static void main(String[] args) {
		//System.out.println(i);
		System.out.println(j);
		//test1()
		test2();
		
		ObjectCreation ObjCre = new ObjectCreation();
		System.out.println(ObjCre.i);
		ObjCre.test1();
	}
}
