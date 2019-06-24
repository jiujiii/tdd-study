package com.study.tdd.user.entity;

import com.study.tdd.base.BaseDto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@ToString
@Accessors(chain = true)
@Table(name = "UMS_ADMIN")
public class UmsAdmin extends BaseDto {

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
