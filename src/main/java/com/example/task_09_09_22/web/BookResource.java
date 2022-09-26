package com.example.task_09_09_22.web;

import com.example.task_09_09_22.dto.BookDTO;
import com.example.task_09_09_22.services.BookService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/")
public class BookResource {

    private final BookService bookService;

    public BookResource(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("book")
    public Page<BookDTO> getBooks(@RequestParam(required = false) String name, Pageable pageable) {
        return bookService.getAllBooks(name, pageable);
    }


    @PostMapping("book")
    public BookDTO createBook(@RequestBody BookDTO book) {

        return bookService.createBook(book);

    }

    @PutMapping("book")
    public BookDTO updateBook(@RequestBody BookDTO book) throws IllegalAccessException {
        if (book.getId() == null) {
            throw new IllegalAccessException("id not found");
        }
        return bookService.updateBook(book);
    }

    @DeleteMapping("book")
    public Boolean deleteBook(@RequestParam Long id) throws IllegalAccessException {
        if (id == null) {
            throw new IllegalAccessException("id not found");
        }
        return bookService.deleteBook(id);
    }


    @GetMapping("count_of_books")
    public int getCountOfBooks() {
        return bookService.getCountOfBooks();
    }

//    @GetMapping("authors_with_count_of_books")
//    public List<AuthorFioAndCountOfAuthorsBooks> getMy() {
//        return bookService.getAuthorsWithCountOfBooks();
//    }


}
