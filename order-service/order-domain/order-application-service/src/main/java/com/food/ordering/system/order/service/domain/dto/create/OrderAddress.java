package com.food.ordering.system.order.service.domain.dto.create;

import lombok.Data;

@Data
public class OrderAddress {
    private String street;
    private String postalCode;
    private String city;
}
