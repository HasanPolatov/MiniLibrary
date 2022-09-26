package com.example.task_09_09_22.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "author")
@Data
public class Author {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fio")
    private String fio;

    @Column(name = "birth_date")
    private String birthDate;

    @Column(name = "gender")
    private String gender;

//    @ManyToMany()
//    @JoinTable(name = "book_authors", joinColumns = @JoinColumn(name = "authors_id"), inverseJoinColumns = @JoinColumn(name = "book_id"))
//    private List<Book> books;



    public Author id(Long id) {
        this.id = id;
        return this;
    }

    public Author fio(String fio) {
        this.fio = fio;
        return this;
    }

    public Author birthDate(String birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public Author gender(String gender) {
        this.gender = gender;
        return this;
    }
//    public Author books(List<Book> books) {
//        this.books = books;
//        return this;
//    }


}
