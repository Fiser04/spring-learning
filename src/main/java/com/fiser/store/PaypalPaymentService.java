package com.fiser.store;

import org.springframework.stereotype.Service;

//@Service("PayPal")
public class PaypalPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        // Implementation for processing payment with PayPal
        System.out.println("Processing payment of $" + amount + " with PayPal.");
    }
}
