package test_doubles.spy;

import test_doubles.model.Book;
import test_doubles.repository.BookRepository;

public class BookService {
	
	private BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public void addBook(Book book){
		if(book.getPrice() > 400){
			return;
		}
		bookRepository.save(book);
	}
	
}
