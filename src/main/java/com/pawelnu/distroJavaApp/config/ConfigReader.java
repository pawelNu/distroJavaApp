package com.pawelnu.distroJavaApp.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Properties;

public class ConfigReader {
    public static Properties readConfig() throws IOException, URISyntaxException {
        Properties properties = new Properties();

        // Directory with jar file
        String jarDir = new File(ConfigReader.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getParent();

        // Create full path to config file
        String configPath = jarDir + File.separator + "config.properties";
        configPath = "config.properties";
        System.out.println("Katalog config.properties:" + configPath);

        try (FileInputStream fileInputStream = new FileInputStream(configPath)) {
            properties.load(fileInputStream);
        }
        return properties;
    }
}

