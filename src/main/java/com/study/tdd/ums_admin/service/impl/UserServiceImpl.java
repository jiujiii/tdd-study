package com.study.tdd.ums_admin.service.impl;

import com.study.tdd.ums_admin.entity.UmsAdmin;
import com.study.tdd.ums_admin.repository.UmsAdminRepository;
import com.study.tdd.ums_admin.service.IUserService;
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
