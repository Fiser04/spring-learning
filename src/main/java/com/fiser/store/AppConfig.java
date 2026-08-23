package com.fiser.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Value("${payment.provider}")
    private String paymentProvider;

    @Bean
    public PaymentService stripe() {
        return new StripePaymentService();
    }

    @Bean
    public PaymentService paypal() {
        return new PaypalPaymentService();
    }

    @Bean
    public OrderService orderService() {
        if ("stripe".equals(paymentProvider)) {
            return new OrderService(stripe());
        } else if ("paypal".equals(paymentProvider)) {
            return new OrderService(paypal());
        }
        throw new IllegalArgumentException("Unsupported payment provider: " + paymentProvider);
    }
}
