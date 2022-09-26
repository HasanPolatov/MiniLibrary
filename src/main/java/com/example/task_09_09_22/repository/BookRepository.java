package com.example.task_09_09_22.repository;

import com.example.task_09_09_22.entities.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

//    Long countBooksByAuthorsId(Long id);

    Page<Book> findAllByNameContainingIgnoreCase(String name, Pageable pageable);

}
