package com.example.task_09_09_22.services;

import com.example.task_09_09_22.dto.AuthorDTO;
import com.example.task_09_09_22.mapper.AuthorMapper;
import com.example.task_09_09_22.repository.AuthorRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Page<AuthorDTO> getAllAuthors(String fio, Pageable pageable) {

        if(fio != null && !"".equals(fio)) {

            return authorRepository.findAllByFioContainingIgnoreCase(fio, pageable)
                    .map(AuthorMapper::toDTO);

        } else {
            return authorRepository.findAll(pageable)
                    .map(AuthorMapper::toDTO);
        }


    }

    public AuthorDTO createAuthor(AuthorDTO author) {
        return AuthorMapper.toDTO(authorRepository.save(AuthorMapper.toEntity(author)));
    }

    public AuthorDTO updateAuthor(AuthorDTO author) {
        return AuthorMapper.toDTO(authorRepository.save(AuthorMapper.toEntity(author)));
    }

    public Boolean deleteAuthor(Long id) {
        authorRepository.deleteById(id);
        return true;
    }

//    public List<AuthorDTO> getAuthorsWithCountOfBooks() {
//
//        return authorRepository.findAll()
//                .stream()
//                .map(AuthorMapper::toDTO)
//                .collect(Collectors.toList());
//    }


}
