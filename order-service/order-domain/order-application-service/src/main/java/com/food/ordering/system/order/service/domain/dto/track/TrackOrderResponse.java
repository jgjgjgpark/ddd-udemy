package com.food.ordering.system.order.service.domain.dto.track;

import com.food.ordering.system.order.service.domain.valueobject.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class TrackOrderResponse {
    private UUID orderTrackingId;
    private OrderStatus orderStatus;
    private List<String> failureMessages;

}
