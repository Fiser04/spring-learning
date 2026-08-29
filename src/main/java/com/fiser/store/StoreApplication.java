package com.fiser.store;

import com.fiser.store.Models.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

    static void main(String[] args) {
        SpringApplication.run(StoreApplication.class, args);

        var user = User.builder()
                .name("John Doe")
                .email("john.doe@example.com")
                .password("password")
                .addresses(new java.util.ArrayList<>())
                .tags(new java.util.HashSet<>())
                .build();
        user.addTag("VIP");

        var profile = com.fiser.store.Models.Profile.builder()
                .bio("Hello, I'm John!")
                .phoneNumber("123-456-7890")
                .dateOfBirth(java.time.LocalDate.of(1990, 1, 1))
                .loyaltyPoints(100)
                .user(user)
                .build();

        user.setProfile(profile);
        System.out.println("User: " + user.getName() + ", Email: " + user.getEmail() + ", Profile: " + user.getProfile().getBio());
    }

}
