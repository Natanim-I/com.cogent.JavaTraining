/**
 * 
 */
package com.cogent.advancedconcept.day10;

/**
 * @author : Natanim
 *
 * @date : Jan 20, 2023
 */
public interface Vehicle {
	String getBrand();
	String speedUp();
	String slowDown();
	
	default String turnAlarmOn() {
		return "Turning the vehiche alarm on";
	}
	
	default String turnAlarmOff() {
		return "Turning the vehiche alarm off";
	}
}
