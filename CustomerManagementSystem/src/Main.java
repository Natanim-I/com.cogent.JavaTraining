/**
 * 
 */

/**
 * @author: Natanim
 *
 * @date: Jan 18, 2023
 */

import java.util.Scanner;
import com.cogent.controller.*;
public class Main {
	public static void main(String[] args) {
		int choice=0;
		Scanner sc = new Scanner(System.in);
		CustomerController cc = new CustomerController();
		System.out.println("********************************");
		System.out.println("Welcome to our customer controller program!");
		
		do {
			System.out.println("1 - Add record");
			System.out.println("2 - Read record");
			System.out.println("3 - Update record");
			System.out.println("4 - Delete record");
			System.out.println("5 - Find record by id");
			System.out.println("6 - Find youngest customer");
			System.out.println("7 - Exit the program");
			
			choice=sc.nextInt();
			cc.accept(choice);
		}while(choice!=7);
	}
}
