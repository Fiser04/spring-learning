package com.fiser.store.Repositories;

import com.fiser.store.Models.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
}