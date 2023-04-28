/**
 * 
 */
package com.mneumann1.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mneumann1.model.Book;
import com.mneumann1.model.Student;
import com.mneumann1.repository.BookRepository;
import com.mneumann1.repository.StudentRepository;

/**
 * @author MNEUMANN1
 *
 */
@Component
public class TestRunner implements CommandLineRunner {
	
	@Autowired
	private BookRepository bookRepo;
	
	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		// create the book-objects
		Book book1 = new Book(101, "Die Bibel");
		Book book2 = new Book(102, "Duden");
		
		// save this
		bookRepo.save(book1);
		bookRepo.save(book2);
		
		// create the Set of Books
		Set<Book> books = Set.of(book1, book2);
		
		Student student = new Student(50, "Max Lange", books);
		
		// save this
		studentRepo.save(student);

	}
}