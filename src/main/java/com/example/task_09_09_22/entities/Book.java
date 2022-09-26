package com.example.task_09_09_22.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "book")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "print_date")
    private String printDate;

    @ManyToMany()
    private List<Author> authors;

    public Book id(Long id) {
        this.id = id;
        return this;
    }

    public Book name(String name) {
        this.name = name;
        return this;
    }

    public Book printDate(String printDate) {
        this.printDate = printDate;
        return this;
    }

    public Book authors(List<Author> authors) {
        this.authors = authors;
        return this;
    }
}
