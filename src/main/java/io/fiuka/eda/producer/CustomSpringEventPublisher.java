package io.fiuka.eda.producer;

import io.fiuka.eda.event.CustomSpringEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class CustomSpringEventPublisher {

    private ApplicationEventPublisher applicationEventPublisher;

    public void publishCustomEvent(final String message) {
        log.info("Publishing custom event.");
        applicationEventPublisher.publishEvent(new CustomSpringEvent(this, message));
    }

}
