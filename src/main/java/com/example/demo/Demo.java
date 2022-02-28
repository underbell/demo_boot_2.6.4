package com.example.demo;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/*
CREATE TABLE IF NOT EXISTS `demo` (
    `id` SERIAL PRIMARY KEY,
    `use_yn` bit(1) NOT NULL DEFAULT b'1' COMMENT '사용여부'
);

INSERT INTO `demo` VALUES (1, b'1');
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table("demo")
public class Demo {
    @Id
    private Long id;
    private Boolean useYn;

    public Demo(Long id, Boolean useYn) {
        this.id = id;
        this.useYn = useYn;
    }
}
