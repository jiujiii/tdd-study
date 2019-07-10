package com.study.tdd.author.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Getter
@ToString
@Accessors(chain = true)
@Entity
public class Author {

    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 地址
     */
    private String address;

    /**
     * 身份证
     */
    private String idCard;

    /**
     * 银行卡
     */
    private String bankCard;

    /**
     * 审核状态
     */
    private Byte verifyStatus;
}
