package com.example.yullmemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class YullmemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(YullmemoApplication.class, args);
    }

}
