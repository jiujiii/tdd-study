package com.study.tdd.author.config;

import com.study.tdd.author.domain.Author;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;

@Configuration
public class AuthorRepositoryConfig {

    @Bean
    public SimpleJpaRepository<Author,Long> authorRepository(EntityManager em){
        return new SimpleJpaRepository<>(Author.class,em);
    }

}
