package io.fiuka.eda.consumer;

import io.fiuka.eda.event.UserRegistrationEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserRegistrationListener {

    @EventListener
    public void handleUserRegistration(UserRegistrationEvent event) {
        log.info("User registered: {}", event.getUsername());
    }

}
