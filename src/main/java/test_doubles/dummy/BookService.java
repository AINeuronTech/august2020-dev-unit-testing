package test_doubles.dummy;

import test_doubles.model.Book;
import test_doubles.repository.BookRepository;

public class BookService {
	
	private BookRepository bookRepository;
	private EmailService emailService;
	
	public BookService(BookRepository bookRepository, EmailService emailService) {
		this.bookRepository = bookRepository;
		this.emailService = emailService;
	}
	
	public void addBook(Book book){
		bookRepository.save(book);
	}
	
	public int findNumberOfBooks(){
		return bookRepository.findAll().size();
	}
	
	// Other methods which use EmailService
}
