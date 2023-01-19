/**
 * 
 */
package com.cogent.day05;

/**
 * @author: Natanim
 *
 * @date: Jan 13, 2023
 */
public class GCDemo {
	int objId;
	
	public GCDemo(int objId) {
		this.objId = objId;
		System.out.println("Created"+objId);
	}
	
	public static void main(String[] args) {
	
		for(int i =1; i<500000; i++) {
		    new GCDemo(i);
		}
	}
	
	@Override
	protected void finalize() {
		System.out.println("Finalized"+objId);
	}

}
