package com.github.artemy.spring_cloud_config_refresh.app.web;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("app")
public class AppConfig {
    private String name = "";
}
