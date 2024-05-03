package com.deysi.arqhax.demo.adapters.out.repository;

import com.deysi.arqhax.demo.adapters.out.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
