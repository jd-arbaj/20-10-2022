/*
Q.3     Create a class Book with id, name as the member variables.

	Create  BookNotFoundException as a exception and create one argument constructor which is accepting String message.

	Create a test class with an array of 5 books with ids starting from 1.

	Create a method findById(Book[] books , int id) which will take the previously created book array and one id to find the book.

	Print "Found" if the book is present with the given id else throw BookNotFoundException with a message "Book with the given id is not present".

	Handle the exception in main method and print the stacktrace in catch block.
*/

package com.exception.bll;

public class Book {

		
		// Instance variables
		int id;
		String name;

		//Perameterized constructor
		public Book(int id,String name) {
			this.id=id;
			this.name=name;
		}
		//get method for fetch id
		public int getId() {
			return id;
		};
		
	
	
}
