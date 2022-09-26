package com.example.task_09_09_22.mapper;

import com.example.task_09_09_22.dto.BookDTO;
import com.example.task_09_09_22.entities.Book;

public class BookMapper {

    public static BookDTO toDTO(Book entity) {
        return BookDTO
                .builder()
                .id(entity.getId())
                .name(entity.getName())
                .printDate(entity.getPrintDate())
                .authors(entity.getAuthors())
                .build();
    }

    public static Book toEntity(BookDTO dto) {
        return new Book()
                .id(dto.getId())
                .name(dto.getName())
                .printDate(dto.getPrintDate())
                .authors(dto.getAuthors());
    }

}
