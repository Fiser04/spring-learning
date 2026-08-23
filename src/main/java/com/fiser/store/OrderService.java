package com.fiser.store;

public class OrderService {
    private final PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {

        // Implementation for placing an order
        paymentService.processPayment(100.0); // Example amount
    }
}
