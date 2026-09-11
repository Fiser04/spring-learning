package com.fiser.store.Services;

import com.fiser.store.Models.Address;
import com.fiser.store.Models.User;
import com.fiser.store.Repositories.AddressRepository;
import com.fiser.store.Repositories.ProfileRepository;
import com.fiser.store.Repositories.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Id;
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

    @Transactional
    public void persistRelated(){
        var user = User.builder()
                .name("John Doe")
                .email("john.doe@example.com")
                .password("12345")
                .build();
        var address = Address.builder()
                .street("123 Main St")
                .city("Anytown")
                .zipcode("12345")
                .state("CA")
                .user(user)
                .build();
        user.addAddress(address);
        userRepository.save(user);
    }
}
