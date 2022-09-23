package com.food.ordering.system.order.service.domain.dto.create;

import com.food.ordering.system.order.service.domain.valueobject.OrderStatus;

import java.util.UUID;

public class CreateOrderResponse {
    private UUID orderTrackingId;
    private OrderStatus orderStatus;
    private String message;
}
