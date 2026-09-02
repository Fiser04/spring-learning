package com.fiser.store.Repositories;

import com.fiser.store.Models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
