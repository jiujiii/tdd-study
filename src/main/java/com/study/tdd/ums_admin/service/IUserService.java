package com.study.tdd.ums_admin.service;

import com.study.tdd.ums_admin.entity.UmsAdmin;

import java.util.Optional;

public interface IUserService {

    Optional<UmsAdmin> selectOne(Long id);

}
