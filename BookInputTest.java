package net.javacode;
import java.util.Scanner;

public class BookInputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book();
		
		Scanner Title= new Scanner(System.in);
		Scanner Author= new Scanner(System.in);
		Scanner numberOfPages= new Scanner(System.in);
		
		
		System.out.println("Please enter the title of the book");
		b.title = Title.nextLine();
		
		System.out.println("Please enter author name");
		b.author = Author.nextLine();
		
		System.out.println("please Enter the number of pages");
		b.numberOfPages = numberOfPages.nextInt();
		
		System.out.println("The book title is: " + b.title);
		System.out.println("The book author  is: " + b.author);
		System.out.println("The book has "+ b.numberOfPages +" pages");
	}

}
