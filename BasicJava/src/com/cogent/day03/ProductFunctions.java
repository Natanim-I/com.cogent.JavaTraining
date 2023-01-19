/**
 * 
 */
package com.cogent.day03;

/**
 * @author: Natanim
 *
 * @date: Jan 11, 2023
 */
import java.util.*;
public class ProductFunctions {
	static void create(Product[] prod, int size) {
		Scanner Sc = new Scanner(System.in);
		for(int i = 0; i<size; i++) {
			System.out.println("Insert product id : ");
			prod[i].setProductId(Sc.nextInt());
			System.out.println("Insert product name : ");
			prod[i].setProductName(Sc.next());
			System.out.println("Insert product price : ");
			prod[i].setProductPrice(Sc.nextDouble());
		}
	}
}
