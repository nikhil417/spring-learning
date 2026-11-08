package com.scaler.springlearning.order;

import com.scaler.springlearning.notification.NotificationService;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final NotificationService notificationService;

    public OrderService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void placeOrder() {
        notificationService.sendNotification("Order Confirmed");
    }
}
