package com.pawelnu.distroJavaApp;

import com.pawelnu.distroJavaApp.config.ConfigReader;

import java.io.Console;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {

        System.setProperty("file.encoding", "UTF-8");
        System.setProperty("console.encoding", "UTF-8");

        try {
            Properties config = ConfigReader.readConfig();
            String testTest = config.getProperty("test.test");
            System.out.println(testTest);
        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }

    }
}
