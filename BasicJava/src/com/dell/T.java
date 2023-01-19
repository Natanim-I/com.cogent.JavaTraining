/**
 * 
 */
package com.dell;

import com.hp.X;

/**
 * @author: Natanim
 *
 * @date: Jan 13, 2023
 */
public class T {
	public void Access() {
		X x1 = new X();
		//System.out.println(x1.p);//no because private
		//System.out.println(x1.q);//no because different package
		//System.out.println(x1.r);//no because different package
		System.out.println(x1.s);
	}
	public static void main(String[] args) {
		T t1 = new T();
		t1.Access();
	}
}
