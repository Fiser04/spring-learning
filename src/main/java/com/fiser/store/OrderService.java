package com.fiser.store;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Service
public class OrderService {
    private final PaymentService paymentService;

    public OrderService(@Qualifier("Stripe") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.processPayment(100.0); // Example amount
    }
}
