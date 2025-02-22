package com.example.art_galery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class ArtGaleryApplication {
    public static void main(String[] args) {
        SpringApplication.run(ArtGaleryApplication.class, args);
    }
}
