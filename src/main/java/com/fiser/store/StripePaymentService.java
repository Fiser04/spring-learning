package com.fiser.store;

public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        // Implementation for processing payment with Stripe
        System.out.println("Processing payment of $" + amount + " with Stripe.");
    }
}
