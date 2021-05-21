package com.github.artemy.spring_cloud_config_refresh.app;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.cloud.context.environment.EnvironmentChangeEvent;
import org.springframework.cloud.context.scope.refresh.RefreshScopeRefreshedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.lang.NonNull;

@Slf4j
@SpringBootApplication
public class MyAwesomeApplication {
    public static void main(final String[] args) {
        SpringApplication.run(MyAwesomeApplication.class, args);
    }

    @EventListener({ApplicationPreparedEvent.class, EnvironmentChangeEvent.class, RefreshScopeRefreshedEvent.class})
    public void onApplicationEvent(@NonNull final ApplicationEvent event) {
        if (event instanceof EnvironmentChangeEvent) {
            final var changedProperties = ((EnvironmentChangeEvent) event).getKeys();
            LOGGER.info("Changed properties {}", changedProperties);
        }
    }

}

