/**
 * 
 */
package com.mneumann1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mneumann1.model.Book;

/**
 * @author MNEUMANN1
 *
 */
public interface BookRepository extends JpaRepository<Book, Integer> {

}
