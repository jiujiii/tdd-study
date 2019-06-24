package com.study.tdd.user.repository;

import com.study.tdd.user.entity.UmsAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UmsAdminRepository extends JpaRepository<UmsAdmin,Long> {
}
