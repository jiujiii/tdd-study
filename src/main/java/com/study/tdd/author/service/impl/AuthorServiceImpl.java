package com.study.tdd.author.service.impl;

import com.study.tdd.author.domain.Author;
import com.study.tdd.author.service.IAuthorService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorServiceImpl implements IAuthorService {

    private final SimpleJpaRepository<Author,Long> authorRepository;

    public AuthorServiceImpl(SimpleJpaRepository<Author, Long> authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Optional<Author> findOneById(Long id) {
        return authorRepository.findById(id);
    }

    @Override
    public Page<Author> findAllByPageable(Pageable pageable) {
        return authorRepository.findAll(pageable);
    }
}
