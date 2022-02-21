package day13;

import java.util.*;

public class AbstractClassess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        String title = scan.nextLine();
        String author = scan.nextLine();
        int price = scan.nextInt();
        scan.close();
        Book book = new MyBook(title, author, price) ;
        book.display();
	}

}

class Book {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void display() {
		System.out.println("Title: " + this.title);
		System.out.println("Author: " + this.author);
		
	}
}

class MyBook extends Book {
	private int price;
	
	public MyBook(String title, String author, int price) {
		super(title, author);
		this.price = price;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Price: " + this.price);
	}
	
	

}
