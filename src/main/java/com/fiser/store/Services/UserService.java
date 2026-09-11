package com.fiser.store.Services;

import com.fiser.store.Models.User;
import com.fiser.store.Repositories.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final EntityManager entityManager;

    @Transactional
    public void tryUserService() {
        var user = User.builder()
                .name("Jane Doe")
                .email("jane.doe@example.com")
                .password("12345")
                .build();
        if(entityManager.contains(user)){
            System.out.println("Persistent context contains user");
        } else {
            System.out.println("Transient/Detached context contains user");
        }
            userRepository.save(user);
        if(entityManager.contains(user)){
            System.out.println("Persistent context contains user");
        } else {
            System.out.println("Transient/Detached context contains user");
        }
    }
}
