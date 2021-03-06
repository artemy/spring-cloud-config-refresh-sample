package com.github.artemy.spring_cloud_config_refresh.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServer {
    public static void main(final String[] args) {
        SpringApplication.run(ConfigServer.class, args);
    }
}
