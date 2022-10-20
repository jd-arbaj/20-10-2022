package com.exception.bll;

public class BookTest {

	public static void main(String[] args) {

		//Create 5 book objects
		Book book1 = new Book(1,"Ocean of C");
		Book book2 = new Book(2,"Mathematics");
		Book book3 = new Book(3,"Reasoning");
		Book book4 = new Book(4,"Computer Science");
		Book book5 = new Book(5,"Artificial Intelligence");
		
		//Store all books details in books array
		Book books[] = {book1,book2,book3,book4,book5};
		
		//Find book By Id
		try {
			if(findById(books,10)) {
				System.out.println("Book is present");
			}
			else{
				throw new BookNotFoundException("Book with the given id is not present");
			}
		}catch(BookNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//Function for search book
	public static boolean findById(Book[] books , int id) {
		for(Book b:books) {
			if(b.getId()==id)
			return true;
		}
		return false;
	}
}
