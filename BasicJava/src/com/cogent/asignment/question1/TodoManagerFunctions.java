/**
 * 
 */
package com.cogent.asignment.question1;
/**
 * @author: Natanim
 *
 * @date: Jan 16, 2023
 */
import java.util.*;

public class TodoManagerFunctions {
	public static void add(TodoManager todo[], int size) {
		Scanner Sc = new Scanner(System.in);
		for(int i=0; i<todo.length; i++) {
			TodoManager todo1 = new TodoManager();
			System.out.println("Enter task id : ");
			int taskId = Sc.nextInt();
			System.out.println("Enter task name : ");
		    String taskName = Sc.next();
			
			todo1.setTaskId(taskId);
			todo1.setTaskName(taskName);
			
			todo[i] = todo1;
		}
		System.out.println("Task added succesfully!!!");
	}
	
	public static void update(TodoManager todo[], int index) {
		System.out.println("*******Data index menu******");
		System.out.println("1-> To update task id");
		System.out.println("2-> To update task name");
		Scanner Sc = new Scanner(System.in);
		int taskIndex = -1;
		while(taskIndex < 1 || taskIndex > 2) {
			System.out.println("Insert the index of the task data you want to update ");
			taskIndex = Sc.nextInt();
		}
		if(taskIndex == 1) {
			System.out.println("Insert the task id : ");
			int newId = Sc.nextInt();
			todo[index].setTaskId(newId);
		} else {
			System.out.println("Insert task name : ");
			String newName = Sc.next();
			todo[index].setTaskName(newName);
		}
		System.out.println("Task Data Updated!!!");
	}
	
	public static void delete(TodoManager todo[], int deleteIndex) {
		for(int i = 0; i < todo.length; i++) {
			if(i == deleteIndex) {
				todo[i] = todo[i+1];
			}
		}
		todo[todo.length-1] = null;   
		System.out.println("Task deleted!!!");
	}
	
	public static void view(TodoManager todo[]) {
		for(int i = 0; i<todo.length; i++) {
			System.out.println("Task id : " + todo[i].getTaskId());
			System.out.println("Task name : " + todo[i].getTaskName());
			System.out.println();
		}
	}
	
	public static void search(TodoManager todo[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("********Task search menu********");
		System.out.println("1-> Search by task id");
		System.out.println("2-> Search by task name");
		int searchChoice = Sc.nextInt();
		boolean searchFound = false;
		while(searchChoice < 1 || searchChoice > 2) {
			System.out.println("Insert correct choice : ");
			searchChoice = Sc.nextInt();
		}
		
		if(searchChoice == 1) {
			System.out.println("Enter the task id : ");
			int searchId = Sc.nextInt();
			for(int i = 0; i< todo.length; i++) {
				if(searchId == todo[i].getTaskId()) {
					System.out.println("Search found");
					System.out.println("*********************************");
					System.out.println("Task id : "+ todo[i].getTaskId());
					System.out.println("Task name : "+ todo[i].getTaskName());
					System.out.println("*********************************");
					System.out.println();
					searchFound = true;
				}
			}
			if(!searchFound) {
				System.out.println("**********************************");
				System.out.println("No task match your search!!!");
				System.out.println("**********************************");
			}
		}
		if(searchChoice == 2) {
			System.out.println("Enter the task name : ");
			String searchName = Sc.next();
			for(int i = 0; i< todo.length; i++) {
				if(searchName.equals(todo[i].getTaskName())) {
					System.out.println("Search found");
					System.out.println("*********************************");
					System.out.println("Task id : "+ todo[i].getTaskId());
					System.out.println("Task name : "+ todo[i].getTaskName());
					System.out.println("*********************************");
					System.out.println();
					searchFound = true;
				}
			}
			if(!searchFound) {
				System.out.println("*******************************");
				System.out.println("No task match your search!!!");
				System.out.println("*******************************");
			}
		}
	}
}
