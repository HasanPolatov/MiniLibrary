package com.example.task_09_09_22.services;

import com.example.task_09_09_22.dto.BookDTO;
import com.example.task_09_09_22.mapper.BookMapper;
import com.example.task_09_09_22.repository.BookRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }





    public Page<BookDTO> getAllBooks(String name, Pageable pageable) {

        if (name != null && !"".equals(name)) {
            return bookRepository.findAllByNameContainingIgnoreCase(name, pageable)
                    .map(BookMapper::toDTO);
        } else {
            return bookRepository.findAll(pageable)
                    .map(BookMapper::toDTO);
        }


    }

    public BookDTO createBook(BookDTO book) {
        return BookMapper.toDTO(bookRepository.save(BookMapper.toEntity(book)));
    }

    public BookDTO updateBook(BookDTO book) {
        return BookMapper.toDTO(bookRepository.save(BookMapper.toEntity(book)));
    }

    public Boolean deleteBook(Long id) {
        bookRepository.deleteById(id);
        return true;
    }

    public int getCountOfBooks() {
        return (int) bookRepository.count();
    }

//    public Long getCountOfAuthorsBooks(Long id) {
//        return bookRepository.countBooksByAuthorsId(id);
//    }

//    public List<AuthorFioAndCountOfAuthorsBooks> getAuthorsWithCountOfBooks() {
//
//        return authorRepository.findAll()
//                .stream()
//                .map(author -> new AuthorFioAndCountOfAuthorsBooks(author.getFio(), getCountOfAuthorsBooks(author.getId())))
//                .toList();
//    }

    /*public List<AuthorDTO> getBooksByAuthorsId(Long bookId) {

        return authorRepository.findAll()
                .stream()
                .map(AuthorMapper::toDTO)
                .filter()

    }*/


}
