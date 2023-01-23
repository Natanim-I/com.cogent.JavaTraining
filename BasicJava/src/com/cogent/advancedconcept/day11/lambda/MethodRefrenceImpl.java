/**
 * 
 */
package com.cogent.advancedconcept.day11.lambda;

/**
 * @author : Natanim
 *
 * @date : Jan 23, 2023
 */
public class MethodRefrenceImpl implements MethodReference {
	public static void main(String[] args) {
		MethodReference mr = (i) -> System.out.println(i);
		mr.myMethod(100);
		
		MethodReferenceImpl mrimpl = new MethodReferenceImpl();
		MethodReference mr1 = mrimpl::myMethod1;
		mr1.myMethod1(100);
	}
	public void myMethod1(int i) {
		System.out.println(i);
	}
}
