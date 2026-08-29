package com.fiser.store;

import com.fiser.store.Models.Tag;
import com.fiser.store.Models.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreApplication.class, args);

        var user = User.builder()
                .name("John Doe")
                .email("john.doe@example.com")
                .password("password")
                .addresses(new java.util.ArrayList<>())
                .tags(new java.util.HashSet<>())
                .build();
        user.addTag("VIP");
        System.out.println("User: " + user.getName() + ", Email: " + user.getEmail() + ", Tags: " + user.getTags().stream().map(Tag::getName).reduce((a, b) -> a + ", " + b).orElse(""));
    }

}
