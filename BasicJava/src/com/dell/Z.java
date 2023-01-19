/**
 * 
 */
package com.dell;

/**
 * @author: Natanim
 *
 * @date: Jan 13, 2023
 */

import com.hp.X;

public class Z extends X {
	public void Access() {
		X x1 = new X();
		//System.out.println(x1.p);//no because private
		//System.out.println(x1.q);//no because different package
		System.out.println(r);//yes because inherits the properties of X 
		System.out.println(x1.s);
	}
	
	public static void main(String[] args) {
		Z z1 = new Z();
		z1.Access();
	}
}
