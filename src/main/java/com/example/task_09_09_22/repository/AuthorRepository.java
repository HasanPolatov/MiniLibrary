package com.example.task_09_09_22.repository;

import com.example.task_09_09_22.entities.Author;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

//    @Query(value = "select count(a) from Author a join ")
//    Long getCountOfAuthorsBooks();

    Page<Author> findAllByFioContainingIgnoreCase(String fio, Pageable pageable);

}
