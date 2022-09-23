package com.food.ordering.system.order.service.domain.dto.create;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class CreateOrderCommand {
    private UUID customerId;
    private UUID restaurantId;
    private BigDecimal price;
    private List<OrderItem> items;
    private OrderAddress address;

}
