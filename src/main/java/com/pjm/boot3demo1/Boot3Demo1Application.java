package com.pjm.boot3demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@EnableJdbcRepositories("com.pjm")
@SpringBootApplication
public class Boot3Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Boot3Demo1Application.class, args);
    }

}
