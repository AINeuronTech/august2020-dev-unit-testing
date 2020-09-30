package test_doubles.common;

import test_doubles.model.Book;
import test_doubles.repository.BookRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FakeBookRepository implements BookRepository {
	
	// In memory database, HashMap or List
	Map<String, Book> bookStore = new HashMap<>();
	
	@Override
	public void save(Book book) {
		bookStore.put(book.getBookId(), book);
	}
	
	@Override
	public Collection<Book> findAll() {
		return bookStore.values();
	}

	@Override
	public Book findBookById(String bookId) {
		return null;
	}

	@Override
	public List<Book> findNewBooks(int days) {
		return null;
	}
}
