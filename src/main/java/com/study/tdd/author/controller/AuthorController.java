package com.study.tdd.author.controller;

import com.study.tdd.author.domain.Author;
import com.study.tdd.author.service.IAuthorService;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/author")
public class AuthorController {

    private final IAuthorService authorService;

    public AuthorController(IAuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping(value = "/{id}")
    public Author findOneById(@PathVariable("id") Long id){
        final Optional<Author> oneById = authorService.findOneById(id);
        return oneById.orElse(null);
    }

    @GetMapping(value = "/{page}/{pageSize}")
    public List<Author> findManyByAddress(@PathVariable("page") int page,
                                          @PathVariable("pageSize") int pageSize){
        final PageRequest of = PageRequest.of(page, pageSize);
        return authorService.findAllByPageable(of).getContent();
    }

}
