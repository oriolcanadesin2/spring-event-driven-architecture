package io.fiuka.eda.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class UserRegistrationEvent extends ApplicationEvent {

    private final String username;

    public UserRegistrationEvent(Object source, String username) {
        super(source);
        this.username = username;
    }

}
