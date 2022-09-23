package com.food.ordering.system.order.service.domain.event.publishe;

import com.food.ordering.system.order.service.domain.event.DomainEvent;

public interface DomainEventPublisher<T extends DomainEvent> {
    void publish(T event);

}
