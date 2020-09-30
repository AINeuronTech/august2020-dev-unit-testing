package test_doubles.fake;

import test_doubles.model.Book;
import test_doubles.repository.BookRepository;

public class BookService {
	
	private BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public void addBook(Book book){
		bookRepository.save(book);
	}
	
	public int findNumberOfBooks(){
		return bookRepository.findAll().size();
	}
}
