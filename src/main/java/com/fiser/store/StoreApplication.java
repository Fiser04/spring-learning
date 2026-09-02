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
//       var user = User.builder()
//                .name("John Doe")
//                .email("john.doe@example.com")
//                .password("123456")
//                .build();
        var userRepository = app.getBean("userRepository", com.fiser.store.Repositories.UserRepository.class);
//        var user = userRepository.findById(1L).orElseThrow();
//        System.out.println("User: " + user.getName() + ", Email: " + user.getEmail());
//        var users = userRepository.findAll();
//        users.forEach(user -> System.out.println("User: " + user.getName() + ", Email: " + user.getEmail()));
        userRepository.deleteById(1L);
    }
}
