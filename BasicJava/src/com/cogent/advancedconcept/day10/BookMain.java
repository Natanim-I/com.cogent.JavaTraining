package com.cogent.advancedconcept.day10;
class Book{
	String name;
	String author;
	int pages;
	double price;
	
	public Book(String name, String author, int pages, double price) {
		super();
		this.name = name;
		this.author = author;
		this.pages = pages;
		this.price = price;
	}
	
	public String toString() {
		return "Book [ Name : " + name + ", Author : " + author + ", Pages : " + pages + ", Price : " + price + " ]"; 
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			Book book = (Book) obj;
			if(((name.compareTo(book.name)) == 0) && ((author.compareTo(book.author)) == 0) && (pages == book.pages) && (price == book.price)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
}
public class BookMain {
	public static void main(String[] args) {
		Book b1 = new Book("My Java Course", "Natanim Issa", 234, 56.9);
		Book b2 = new Book("My Java Course", "Natanim Issa", 234, 100);
		Book b3 = new Book("My Java Course", "Natanim Issa", 234, 56.9);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(b3));
	}
}
