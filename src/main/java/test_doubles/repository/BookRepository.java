package test_doubles.repository;

import test_doubles.model.Book;

import java.util.Collection;
import java.util.List;

public interface BookRepository {
	void save(Book book);
	Collection<Book> findAll();
	Book findBookById(String bookId);
	List<Book> findNewBooks(int days);
}
