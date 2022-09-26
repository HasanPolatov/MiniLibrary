package com.example.task_09_09_22.web;

import com.example.task_09_09_22.dto.AuthorDTO;
import com.example.task_09_09_22.services.AuthorService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/")
public class AuthorResource {

    private final AuthorService authorService;

    public AuthorResource(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("author")
    public Page<AuthorDTO> getAuthors(@RequestParam(required = false) String fio, Pageable pageable) {
        return authorService.getAllAuthors(fio, pageable);
    }

    @PostMapping("author")
    public AuthorDTO createAuthor(@RequestBody AuthorDTO author) {
        return authorService.createAuthor(author);
    }

    @PutMapping("author")
    public AuthorDTO updateAuthor(@RequestBody AuthorDTO author) {
        return authorService.updateAuthor(author);
    }

    @DeleteMapping("author")
    public Boolean deleteAuthor(@RequestParam Long id) {
        return authorService.deleteAuthor(id);
    }


}
