package com.caltech.solutions.learning.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@EnableMongoAuditing
@SpringBootApplication
public class LearnManagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(LearnManagerApplication.class, args);
    }
}
