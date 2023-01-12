/**
 * 
 */
package com.cogent.day04;

/**
 * @author: Natanim
 *
 * @date: Jan 12, 2023
 */

class A{
	A(){
		this(10);
		System.out.println("DC-A");
	}
	A(int i){
		System.out.println("PC-A");
	}
}

class B extends A{
	B(){
		this(10);
		System.out.println("DC-B");
	}
	B(int i){
		System.out.println("PC-B");
	}
}

class C extends B{
	C(){
		this(10,20);
		System.out.println("DC-C");
	}
	C(int i){
		super(10);
		System.out.println("PC-C");
	}
	C(int i, int j){
		System.out.println("PC1-C");
	}
}

public class Day0401 {
	public static void main(String[] args) {
		C c1 = new C(10,20);
		C c2 = new C(10);
		C c3 = new C();
		
	}
}
