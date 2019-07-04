package com.study.tdd.ums_admin.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@ToString
@Setter
@Getter
@Accessors(chain = true)
@Entity
@Table(name = "SYS_USER")
public class SysUser {

    @Id
    @GeneratedValue
    private Long userId;

    private String userName;

    private String passwordEncrypted;

    private String email;

    private String phone;

    private LocalDateTime startActiveDate;

    private LocalDateTime endActiveDate;

    private String status;

    private String description;
}
