package com.fiser.store.Repositories;

import com.fiser.store.Models.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}