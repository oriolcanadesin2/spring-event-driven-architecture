package io.fiuka.eda.consumer;

import io.fiuka.eda.event.CustomSpringEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CustomSpringEventListener {

    @EventListener
    public void onApplicationEvent(CustomSpringEvent event) {
        log.info("Received spring custom event - {}", event.getMessage());
    }

}
