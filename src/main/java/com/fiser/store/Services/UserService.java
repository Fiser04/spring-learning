package com.fiser.store.Services;

import com.fiser.store.Models.User;
import com.fiser.store.Repositories.ProfileRepository;
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
    private final ProfileRepository profileRepository;

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

    @Transactional
    public void showRelatedEntities() {
        var profile = profileRepository.findById(2L).orElseThrow(() -> new RuntimeException("Profile not found"));
        System.out.println("Profile: " + profile.getUser().getName());
    }
}
