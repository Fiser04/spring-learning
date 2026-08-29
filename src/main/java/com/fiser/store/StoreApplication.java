package com.fiser.store;

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
                .build();
        var address = com.fiser.store.Models.Address.builder()
                .street("123 Main St")
                .city("Anytown")
                .state("CA")
                .zipcode("12345")
                .user(user)
                .build();
        user.addAddress(address);

        System.out.println("User: " + user.getName() + ", Email: " + user.getEmail() + ", Address: " + address.getStreet() + ", " + address.getCity() + ", " + address.getState() + " " + address.getZipcode());
    }

}
