package com.claimsfraud.config.server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Slf4j
@EnableConfigServer
@SpringBootApplication
public class App {

    @Configuration
    @ComponentScan("com.claimsfraud.config.server")
    public static class Config {

    }

    public static void main(String[] args) {
        String sshKey = System.getenv("SSH_KEY");
        log.info("SSH Key is null: {}", (sshKey == null || sshKey.isEmpty()));

        SpringApplication.run(App.class, args);
    }
}
