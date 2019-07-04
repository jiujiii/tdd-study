package com.study.tdd.ums_admin.service.impl;

import com.study.tdd.ums_admin.entity.SysUser;
import com.study.tdd.ums_admin.repository.SysUserRepository;
import com.study.tdd.ums_admin.service.ISysUserService;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.Optional;

@Service
public class SysUserServiceImpl implements ISysUserService {

    private SimpleJpaRepository<SysUser,Long> repository;

    private final SysUserRepository sysUserRepository;

    public SysUserServiceImpl(EntityManager em, SysUserRepository sysUserRepository){
        this.repository = new SimpleJpaRepository<>(SysUser.class,em);
        this.sysUserRepository = sysUserRepository;
    }

    @Override
    public Optional<SysUser> findOneById(Long userId) {
        return sysUserRepository.findById(userId);
    }
}
