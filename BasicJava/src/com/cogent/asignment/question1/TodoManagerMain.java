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

public class TodoManagerMain {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int choice = 0;
		TodoManager[] todo = null;
		do {
			System.out.println("*****Menu******");
			System.out.println("1-> Adding a new task");
			System.out.println("2-> Updating a new task");
			System.out.println("3-> Deleting a new Task");
			System.out.println("4-> Searching a new task");
			System.out.println("5-> View Todo List");
			System.out.println("0-> Exit the program");	
			System.out.println("Please enter your choice : ");	
			choice = Sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("How many tasks you want to add : ");
				int size = Sc.nextInt();
				todo = new TodoManager[size];
				TodoManagerFunctions.add(todo,size);
				break;
			case 2:
				int index = -1;
				while(index < 0 || index >= todo.length) {
					System.out.println("Insert the index of the task : ");
					index = Sc.nextInt();
				}
				TodoManagerFunctions.update(todo, index);
				break;
			case 3:
				int deleteIndex = -1;
				while(deleteIndex < 0 || deleteIndex >= todo.length) {
					System.out.println("Insert the index of the task to be deleted : ");
					deleteIndex = Sc.nextInt();
				}
				TodoManagerFunctions.delete(todo, deleteIndex);
				break;
			case 4:
				TodoManagerFunctions.search(todo);
				break;
			case 5:
				TodoManagerFunctions.view(todo);
				break;
			case 0:
				System.out.println("Hope you enjoyed my program!!!");
				break;
			default:
				System.out.println("Incorrect input");
				break;
			}
		}while(choice != 0);
	}
}
