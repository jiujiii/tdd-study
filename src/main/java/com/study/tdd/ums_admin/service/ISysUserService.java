package com.study.tdd.ums_admin.service;

import com.study.tdd.ums_admin.entity.SysUser;

import java.util.Optional;

public interface ISysUserService {

    Optional<SysUser> findOneById(Long userId);

}
