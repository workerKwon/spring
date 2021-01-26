package com.tikwon.spring.controller.user;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import reactor.util.annotation.NonNull;
import reactor.util.annotation.Nullable;

@Data
@Table("user")
public class User {
    @Id
    private Long id;

    private String name;

    private String age;

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public User() {

    }
}
