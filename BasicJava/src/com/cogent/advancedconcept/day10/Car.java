/**
 * 
 */
package com.cogent.advancedconcept.day10;

/**
 * @author : Natanim
 *
 * @date : Jan 20, 2023
 */
public class Car implements Vehicle {
	private String brand;
	
	public Car(String brand) {
		this.brand = brand;
	}

	@Override
	public String getBrand() {
		return brand;
	}

	@Override
	public String speedUp() {
		return "The car is speeding up";
	}

	@Override
	public String slowDown() {
		return "The car is slowing down";
	}
		
	public static void main(String[] args) {
		Vehicle car = new Car("BMW");
		System.out.println(car.getBrand());
		System.out.println(car.speedUp());
		System.out.println(car.slowDown());
		System.out.println(car.turnAlarmOn());
		System.out.println(car.turnAlarmOff());
	}
}
