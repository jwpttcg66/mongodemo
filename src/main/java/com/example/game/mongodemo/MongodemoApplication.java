package com.example.game.mongodemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value = {"classpath:application.properties"})
@SpringBootApplication
@ConfigurationProperties(prefix="mongodemo")
public class MongodemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongodemoApplication.class, args);
    }

}
