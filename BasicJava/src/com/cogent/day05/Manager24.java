/**
 * 
 */
package com.cogent.day05;

/**
 * @author: Natanim
 *
 * @date: Jan 13, 2023
 */
class Person024{
	String name;
	int age;
	double weight;
	
	Person024(){
		
	}
	
	Person024(String name, int age, double weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
}
public class Manager24 {
	public static void main(String[] args) {
		Person024 P1 = new Person024();
		Person024 P2 = new Person024("Natanim",24,50);
		System.out.println(P2.name+ " " + P2.age+ " " + P2.weight);
	}
}
