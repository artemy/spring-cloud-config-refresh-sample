package com.github.artemy.spring_cloud_config_refresh.app.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@EnableConfigurationProperties(AppConfig.class)
@RestController
public class ExampleController {

    private final AppConfig appConfig;

    @GetMapping("/hello")
    String helloWorld() {
        LOGGER.info("Received HTTP request");

        return "Hello world! " + appConfig.getName();
    }
}
