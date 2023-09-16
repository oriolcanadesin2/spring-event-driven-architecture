package io.fiuka.eda.producer;

import io.fiuka.eda.event.UserRegistrationEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserRegistrationPublisher {

    private final ApplicationEventPublisher applicationEventPublisher;

    public void registerUser(String username) {
        // ... user registration logic ...

        // Publish the UserRegistrationEvent
        applicationEventPublisher.publishEvent(new UserRegistrationEvent(this, username));

    }


}
