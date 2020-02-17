package com.caltech.solutions.learning.management.configuration;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author Weverton Souza.
 * Created on 11/01/2020
 */
@Configuration
@EnableConfigurationProperties({PropertiesConfiguration.class})
public class AppConfiguration {
    private PropertiesConfiguration configuration;

    public AppConfiguration(PropertiesConfiguration configuration) {
        this.configuration = configuration;
    }

    public PropertiesConfiguration getMyProperties() {
        return configuration;
    }

    public void setMyProperties(PropertiesConfiguration configuration) {
        this.configuration = configuration;
    }
}
