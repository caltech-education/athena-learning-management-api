package com.caltech.solutions.learning.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableMongoAuditing
@SpringBootApplication
@EnableResourceServer
public class LearnManagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(LearnManagerApplication.class, args);
    }
}
