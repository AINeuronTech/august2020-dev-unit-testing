package test_doubles.mock;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import test_doubles.model.Book;
import test_doubles.repository.BookRepository;

import java.time.LocalDate;

public class MockTest {
	
	@Test
	public void demoMockWithMockito(){
		BookRepository bookRepositoryMock = Mockito.mock(BookRepository.class);
		BookService bookService = new BookService(bookRepositoryMock);
		
		Book book1 = new Book("1234", "Mockito In Action", 500, LocalDate.now());
		Book book2 = new Book("1235", "JUnit 5 In Action", 400, LocalDate.now());
		
		bookService.addBook(book1); // return
		bookService.addBook(book2); // save will be called
		
		Mockito.verify(bookRepositoryMock, Mockito.times(1)).save(book2);
		Mockito.verify(bookRepositoryMock, Mockito.times(0)).save(book1);
		
	}
	
}
