package com.claimsfraud.config.server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@SuppressWarnings("unused")
public class RefreshEventListener {

    @EventListener
    public void handleContextRefresh(ContextRefreshedEvent event) {
        log.info("Refreshing at {0} with event {1}", event.getTimestamp(), event.getClass().getName());
    }


}
