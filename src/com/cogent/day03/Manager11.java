/**
 * 
 */
package com.cogent.day03;

/**
 * @author: Natanim
 *
 * @date: Jan 11, 2023
 */
class Test11{
	int i = 10;
	static int j = 20;
	
	void test1() {
		System.out.println("I am from test 1");
	}
	
	static void test2() {
		System.out.println("I am from test 2");
	}
}
public class Manager11 {

	public static void main(String[] args) {
		Test11 T11 = new Test11();
		System.out.println(T11.i);
		System.out.println(Test11.j);
		T11.test1();
		Test11.test2();
		
		Manager11 M11 = new Manager11();
		M11.main2();
	}
	
	void main2() {
		Test11 t11 = new Test11();
		System.out.println(t11.i);
		System.out.println(Test11.j);
		t11.test1();
		Test11.test2();
	}

}
