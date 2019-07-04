package com.study.tdd.ums_admin.repository;

import com.study.tdd.ums_admin.entity.UmsAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UmsAdminRepository extends JpaRepository<UmsAdmin,Long> {
}
