package com.fiser.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

//    public static void main(String[] args) {
//        SpringApplication.run(StoreApplication.class, args);
//    }
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(StoreApplication.class, args);
        var orderService = applicationContext.getBean(OrderService.class);
        orderService.placeOrder();
    }

}
