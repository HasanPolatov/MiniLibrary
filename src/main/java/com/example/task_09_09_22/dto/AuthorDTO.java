package com.example.task_09_09_22.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthorDTO {

    private Long id;
    private String fio;
    private String birthDate;
    private String gender;
    private Long bookId;

    private Long countOfBooks;

}
