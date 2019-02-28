package com.player;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;

@SpringBootApplication
public class PlayerApplication {

    @Bean
    public SimpleDateFormat dateFormat() {
        return new SimpleDateFormat("DD.MM.YYYY");
    }

    public static void main(String[] args) {
        SpringApplication.run(PlayerApplication.class, args);
    }

}
