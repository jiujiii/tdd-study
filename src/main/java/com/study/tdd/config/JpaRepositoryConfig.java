package com.study.tdd.config;

import com.study.tdd.base.BaseDto;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

@Configuration
@EntityScan("com.study.tdd.user.entity")
public class JpaRepositoryConfig {

//    @Bean
//    public SimpleJpaRepository getSimpleJpaRepository(EntityManager em){
//        return new SimpleJpaRepository<>(BaseDto.class,em);
//    }

}
