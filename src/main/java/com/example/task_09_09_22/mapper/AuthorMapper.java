package com.example.task_09_09_22.mapper;

import com.example.task_09_09_22.dto.AuthorDTO;
import com.example.task_09_09_22.entities.Author;

public class AuthorMapper {

    public static AuthorDTO toDTO(Author entity) {

        return AuthorDTO
                .builder()
                .id(entity.getId())
                .fio(entity.getFio())
                .birthDate(entity.getBirthDate())
                .gender(entity.getGender())
//                .countOfBooks((long) entity.getBooks().size())
                .build();
    }
    public static Author toEntity(AuthorDTO dto) {
        return new Author()
                .id(dto.getId())
                .fio(dto.getFio())
                .birthDate(dto.getBirthDate())
                .gender(dto.getGender());
    }

}
