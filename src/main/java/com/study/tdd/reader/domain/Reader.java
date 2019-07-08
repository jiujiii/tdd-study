package com.study.tdd.reader.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.Entity;

@Setter
@Getter
@ToString
@Accessors(chain = true)
public class Reader {

    private Long id;

    private Long articleId;
}
