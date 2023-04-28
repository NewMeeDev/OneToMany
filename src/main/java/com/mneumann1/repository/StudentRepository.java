/**
 * 
 */
package com.mneumann1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mneumann1.model.Student;

/**
 * @author MNEUMANN1
 *
 */
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
