package com.fiser.store;

import com.fiser.store.Models.Address;
import com.fiser.store.Models.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        var app = SpringApplication.run(StoreApplication.class, args);
        var userService = app.getBean("userService", com.fiser.store.Services.UserService.class);
//        userService.tryUserService();
        userService.showRelatedEntities();
    }
}
