package com.caltech.solutions.learning.management.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.nio.file.StandardCopyOption;

/**
 * @author Weverton Souza.
 * Created on 11/01/2020
 */
@ConfigurationProperties("caltech")
public class PropertiesConfiguration {
    private String property;
    private StandardCopyOption copyOption;

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public StandardCopyOption getCopyOption() {
        return copyOption;
    }

    public void setCopyOption(StandardCopyOption copyOption) {
        this.copyOption = copyOption;
    }
}
