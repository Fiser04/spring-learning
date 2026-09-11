package com.fiser.store.Services;

import com.fiser.store.Models.User;
import com.fiser.store.Repositories.AddressRepository;
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
    private final ProfileRepository profileRepository;
    private final AddressRepository addressRepository;

    @Transactional
    public void tryUserService() {
        var user = User.builder()
                .name("Jane Doe")
                .email("jane.doe@example.com")
                .password("12345")
                .build();
        userRepository.save(user);
    }

    @Transactional
    public void showRelatedEntities() {
        var address = addressRepository.findById(1L).orElseThrow(() -> new RuntimeException("Address not found"));
        System.out.println("Address: " + address.getStreet());
        System.out.println("User: " + address.getUser().getName());
    }
}
