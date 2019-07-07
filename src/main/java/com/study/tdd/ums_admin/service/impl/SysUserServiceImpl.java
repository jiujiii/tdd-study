package com.study.tdd.ums_admin.service.impl;

import com.study.tdd.ums_admin.entity.SysUser;
import com.study.tdd.ums_admin.service.ISysUserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SysUserServiceImpl implements ISysUserService {

    private final SimpleJpaRepository<SysUser,Long> repository;

    public SysUserServiceImpl(@Qualifier("sysUserJpaRepository")
                              SimpleJpaRepository<SysUser, Long> repository) {
        this.repository = repository;
    }

    @Override
    public Optional<SysUser> findOneById(Long userId) {
        return repository.findById(userId);
    }
}
