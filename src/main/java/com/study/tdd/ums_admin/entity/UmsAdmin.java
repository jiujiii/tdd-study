package com.study.tdd.ums_admin.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@ToString
@Accessors(chain = true)
public class UmsAdmin implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String userName;

    private String password;

    private String icon;

    private String email;

    private String nickName;

    private String note;

    private LocalDateTime createTime;

    private LocalDateTime loginTime;

    private Long status;

}
