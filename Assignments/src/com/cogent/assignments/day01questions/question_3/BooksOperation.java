/**
 * 
 */
package com.cogent.assignments.day01questions.question_3;

import java.util.Scanner;

/**
 * @author : Natanim
 *
 * @date : Jan 20, 2023
 * 
 * Aprogran to create books and show books information
 * 
 */
class Book{
	private String bookTitle;
	private double bookPrice;
	
	public Book() {
		super();
	}
	
	public Book(String bookTitle, double bookPrice) {
		super();
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
}

public class BooksOperation {
	private Book books[] = null;
	public static void main(String[] args) {
		BooksOperation bookOperation = new BooksOperation();
		bookOperation.createBooks();
		bookOperation.showBooks();
	}
	
	public void createBooks() {
		Scanner Sc = new Scanner(System.in);
		int size;
		System.out.println("How many books you want to create : ");
		size = Sc.nextInt();
		books = new Book[size];
		for(int i =0; i<size; i++) {
			Book book = new Book();
			System.out.println("Enter the book title : ");
			String bookTitle = Sc.next();
			
			System.out.println("Enter the book price : ");
			double bookPrice = Sc.nextDouble();
			
			book.setBookTitle(bookTitle);
			book.setBookPrice(bookPrice);
			
			books[i] = book;
		}
		System.out.println("Books created successfuly!");
	}
	
	public void showBooks() {
		System.out.println("Book Title				Price");
		for(int i =0; i<books.length; i++) {
			System.out.println(books[i].getBookTitle() + " 					" + books[i].getBookPrice());
		}
	}
}
