package com.example.task_09_09_22.dto;

import com.example.task_09_09_22.entities.Author;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class BookDTO {
    private Long id;
    private String name;
    private String printDate;
    private List<Author> authors;
    private Long countOfBooks;
}
