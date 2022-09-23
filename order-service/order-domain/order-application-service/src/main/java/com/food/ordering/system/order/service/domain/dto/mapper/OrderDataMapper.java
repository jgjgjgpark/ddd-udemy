package com.food.ordering.system.order.service.domain.dto.mapper;

import com.food.ordering.system.order.service.domain.dto.create.CreateOrderCommand;
import com.food.ordering.system.order.service.domain.dto.create.OrderAddress;
import com.food.ordering.system.order.service.domain.entity.Order;
import com.food.ordering.system.order.service.domain.entity.OrderItem;
import com.food.ordering.system.order.service.domain.entity.Product;
import com.food.ordering.system.order.service.domain.entity.Restaurant;
import com.food.ordering.system.order.service.domain.valueobject.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class OrderDataMapper {
    public Restaurant createOrderCommandToRestaurant(CreateOrderCommand command) {
        return Restaurant.builder()
                .restaurantId(new RestaurantId(command.getRestaurantId()))
                .products(command.getItems().stream().map(item ->
                                new Product(new ProductId(item.getProductId()))
                        ).collect(Collectors.toList())
                ).build();
    }

    public Order createOrderCommandToOrder(CreateOrderCommand command){
        return Order.builder()
                .customerId(new CustomerId(command.getCustomerId()))
                .restaurantId(new RestaurantId(command.getRestaurantId()))
                .deliveryAddress(orderAddressToStreetAddress(command.getAddress()))
                .price(new Money(command.getPrice()))
                .items(orderItemsToOrderItemEntities(command.getItems()))
                .build();
    }

    private List<OrderItem> orderItemsToOrderItemEntities(List<com.food.ordering.system.order.service.domain.dto.create.OrderItem> items) {
        return null;
    }

    private StreetAddress orderAddressToStreetAddress(OrderAddress address) {
        return new StreetAddress(
                UUID.randomUUID(),
                address.getStreet(),
                address.getPostalCode(),
                address.getCity()
        );
    }
}
