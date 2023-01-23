/**
 * 
 */
package com.cogent.advancedconcept.day11.collection;

/**
 * @author : Natanim
 *
 * @date : Jan 23, 2023
 */
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList <Integer> list = new ArrayList();
		list.add(new Integer(20));
		list.add(10);
		list.add(30);
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
