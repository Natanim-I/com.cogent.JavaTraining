/**
 * 
 */
package com.hp;

/**
 * @author: Natanim
 *
 * @date: Jan 13, 2023
 */
public class Y {
	public void Access() {
		X x1 = new X();
		//System.out.println(x1.p);//no because private
		System.out.println(x1.q);
		System.out.println(x1.r);
		System.out.println(x1.s);
	}
	public static void main(String[] args) {
		Y y1 = new Y();
		y1.Access();
	}
}
