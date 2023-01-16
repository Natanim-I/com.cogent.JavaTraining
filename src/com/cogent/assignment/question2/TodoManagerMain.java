/**
 * 
 */
package com.cogent.assignment.question2;

/**
 * @author: Natanim
 *
 * @date: Jan 16, 2023
 */
import java.util.*;

public class TodoManagerMain {
	public static void main(String[] args) {
		String name;
		String task1;
		String task2;
		String task3;
		Scanner Sc = new Scanner(System.in);
		System.out.println("*********************************************");
		System.out.println("Todo task manager");
		System.out.println("What is your name : ");
		name = Sc.next();
		System.out.println("Your name is : " + name);
		System.out.println("Insert your first task : ");
		task1 = Sc.next();
		System.out.println("Insert your second  task : ");
		task2 = Sc.next();
		System.out.println("Insert your third task : ");
		task3 = Sc.next();

		System.out.println("Your sorted task");
		System.out.println("Ascending order");
		if(task1.charAt(0) < task2.charAt(0) && task1.charAt(0) < task3.charAt(0)) {
			System.out.println("1 : "+ task1);
			if(task2.charAt(0) < task3.charAt(0)) {
				System.out.println("2 : "+ task2);
				System.out.println("3 : "+ task3);
			}
			else {
				System.out.println("2 : "+ task3);
				System.out.println("3 : "+ task2);
			}
		}else if(task2.charAt(0) < task1.charAt(0) && task2.charAt(0) < task3.charAt(0)) {
			System.out.println("1 : "+ task2);
			if(task1.charAt(0) < task3.charAt(0)) {
				System.out.println("2 : "+ task1);
				System.out.println("3 : "+ task3);
			}
			else {
				System.out.println("2 : "+ task3);
				System.out.println("3 : "+ task1);
			}
		} else {
			System.out.println("1 : "+ task3);
			if(task1.charAt(0) < task2.charAt(0)) {
				System.out.println("2 : "+ task1);
				System.out.println("3 : "+ task2);
			}
			else {
				System.out.println("2 : "+ task2);
				System.out.println("3 : "+ task1);
			}
		}
		System.out.println("Descending order");
		if(task1.charAt(0) > task2.charAt(0) && task1.charAt(0) > task3.charAt(0)) {
			System.out.println("1 : "+ task1);
			if(task2.charAt(0) > task3.charAt(0)) {
				System.out.println("2 : "+ task2);
				System.out.println("3 : "+ task3);
			}
			else {
				System.out.println("2 : "+ task3);
				System.out.println("3 : "+ task2);
			}
		}else if(task2.charAt(0) > task1.charAt(0) && task2.charAt(0) > task3.charAt(0)) {
			System.out.println("1 : "+ task2);
			if(task1.charAt(0) > task3.charAt(0)) {
				System.out.println("2 : "+ task1);
				System.out.println("3 : "+ task3);
			}
			else {
				System.out.println("2 : "+ task3);
				System.out.println("3 : "+ task1);
			}
		} else {
			System.out.println("1 : "+ task3);
			if(task1.charAt(0) > task2.charAt(0)) {
				System.out.println("2 : "+ task1);
				System.out.println("3 : "+ task2);
			}
			else {
				System.out.println("2 : "+ task2);
				System.out.println("3 : "+ task1);
			}
		}
		System.out.println("Your Repeated tasks");
		if(task1.equals(task2)) {
			System.err.println(task1);
		}
		if(task1.equals(task3)) {
			System.err.println(task1);
		}
		if(task2.equals(task3)) {
			System.err.println(task2);
		}
		System.out.println("*****************************************");
	}
}
