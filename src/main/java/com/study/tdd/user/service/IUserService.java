package com.study.tdd.user.service;

import com.study.tdd.user.entity.UmsAdmin;

import java.util.Optional;

public interface IUserService {

    Optional<UmsAdmin> selectOne(Long id);

}
