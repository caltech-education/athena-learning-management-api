package com.caltech.solutions.learning.management.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author Weverton Souza.
 * Created on 11/01/2020
 */
@Configuration
@ConfigurationProperties("spring.datasource")
public class DataBaseConfiguration {
    private String url;
    private String username;
    private String password;
    private final Logger logger = LoggerFactory.getLogger(getClass());

    public DataBaseConfiguration() { }

    @Profile("dev") @Bean
    public void devDatabaseConnection() {
        this.log("Development");
    }

    @Profile("test") @Bean
    public void testDatabaseConnection() {
        this.log("Test");
    }

    @Profile("prod") @Bean
    public void prodDatabaseConnection() {
        this.log("Production");
    }

    private void log(final String environment) {
        this.logger.info(environment + " Environment.");
        this.logger.info(this.getUsername());
        this.logger.info(this.getUrl());
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
