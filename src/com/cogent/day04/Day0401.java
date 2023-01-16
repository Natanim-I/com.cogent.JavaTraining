/**
 * 
 */
package com.cogent.day04;

/**
 * @author: Natanim
 *
 * @date: Jan 12, 2023
 */

class A026{
	A026(){
		this(10);
		System.out.println("DC-A026");
	}
	A026(int i){
		System.out.println("PC-A026");
	}
}

class B026 extends A026{
	B026(int i){
		System.out.println("PC-B026");
	}
}

class C026 extends B026{
	C026(){
		this(10,20);
		super(10);
		System.out.println("DC-C026");
	}
	C026(int i){
		super(10);
		System.out.println("PC-C026");
	}
	C026(int i, int j){
		this(10);
		System.out.println("PC1-C");
	}
}

public class Day0401 {
	public static void main(String[] args) {
		C026 c = new C026();
		
	}
}
