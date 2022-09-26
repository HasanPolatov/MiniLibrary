package com.example.task_09_09_22.helpers;

public class AuthorFioAndCountOfAuthorsBooks {

    private String authorName;
    private Long countOfBooks;

    public AuthorFioAndCountOfAuthorsBooks(String authorName, Long countOfBooks) {
        this.authorName = authorName;
        this.countOfBooks = countOfBooks;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Long getCountOfBooks() {
        return countOfBooks;
    }

    public void setCountOfBooks(Long countOfBooks) {
        this.countOfBooks = countOfBooks;
    }
}
