# Spring Event Driven Architecture

_September 15, 2023_
_Version 0.0.0_

| Version | Date       | Changes     |
|---------|------------|-------------|
| 0.0.0   | 2023-09-15 | First draft |

## Table of Contents
<!-- TOC -->
* [Spring Event Driven Architecture](#spring-event-driven-architecture)
  * [Table of Contents](#table-of-contents)
  * [Overview](#overview)
    * [Custom Events](#custom-events)
  * [Dependencies](#dependencies)
  * [Reference](#reference)
<!-- TOC -->

## Overview

This project is Proof of Concept (PoC) for Spring Event Driven Architecture (EDA).

Spring Framework provides built-in support for event-driven architecture through the ApplicationContext.

Baseline Spring Event Driven Architecture (EDA) is composed of the following components:
- Custom Events
- Event Publishers
- Event Listeners
- Configuring the Application Context

### Custom Events
In Spring, you can create custom events by extending the **ApplicationEvent** class.

### Event Publishers
To publish events, you need to use the **ApplicationEventPublisher** interface, which can be injected into your classes using Spring’s dependency injection. 

You can then call the *publishEvent()* method to send your custom event to all interested listeners.

### Event Listeners
To consume events, you create event listener methods and annotate them with **@EventListener**. 
These methods will be executed whenever an event of the specified type is published.

### Configuring the Application Context
To enable event-driven architecture in your Spring application, you need to configure the Application Context. 

Ensure that your event publisher, custom events, and event listeners are registered as beans in the context.

## Dependencies
- Java 17
- Gradle
- Spring Boot 3.1.3
  - Spring Boot Starter Web
  - Lombok

## Reference
* [Mastering Event-Driven Architecture with Spring: Events, Listeners, and Application Context](https://medium.com/@AlexanderObregon/mastering-event-driven-architecture-with-spring-events-listeners-and-application-context-658ebe184e89)
* [Baeldung Spring Events](https://www.baeldung.com/spring-events)
* [Ruling the Event-Driven Architecture with RabbitMQ](https://medium.com/@jordan-temim/ruling-the-event-driven-architecture-with-rabbitmq-534798bdf17e)