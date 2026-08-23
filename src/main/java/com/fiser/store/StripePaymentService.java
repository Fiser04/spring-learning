package com.fiser.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("Stripe")
@Primary
public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        // Implementation for processing payment with Stripe
        System.out.println("Processing payment of $" + amount + " with Stripe.");
    }
}
