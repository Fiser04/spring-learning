package com.fiser.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("Stripe")
@Primary
public class StripePaymentService implements PaymentService {
    @Value("${stripe.api.url}")
    private String apiUrl;

    @Value("${stripe.enabled}")
    private boolean enabled;

    @Value("${stripe.timeout}")
    private int timeout;

    @Value("${stripe.currency}")
    private List<String> currency;

    @Override
    public void processPayment(double amount) {
        // Implementation for processing payment with Stripe
        System.out.println("Stripe API URL: " + apiUrl);
        System.out.println("Stripe Enabled: " + enabled);
        System.out.println("Stripe Timeout: " + timeout + " seconds");
        System.out.println("Stripe Supported Currencies: " + currency);
        System.out.println("Processing payment of $" + amount + " with Stripe.");
    }
}
