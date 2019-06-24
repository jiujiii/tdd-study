package com.study.tdd.user.service.impl;

import com.study.tdd.user.entity.UmsAdmin;
import com.study.tdd.user.repository.UmsAdminRepository;
import com.study.tdd.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {

    private final UmsAdminRepository umsAdminRepository;

    public UserServiceImpl(UmsAdminRepository umsAdminRepository) {
        this.umsAdminRepository = umsAdminRepository;
    }

    @Override
    public Optional<UmsAdmin> selectOne(Long id) {
        return umsAdminRepository.findById(id);
    }
}
