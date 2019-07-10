package com.study.tdd.author.service;

import com.study.tdd.author.domain.Author;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IAuthorService {

    Optional<Author> findOneById(Long id);

    Page<Author> findAllByPageable(Pageable pageable);
}
