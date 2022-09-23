package com.food.ordering.system.order.service.domain.dto.create;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class OrderItem {
    private UUID productId;
    private Integer quantity;
    private BigDecimal price;
    private BigDecimal subTotal;
}
