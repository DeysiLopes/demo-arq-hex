package com.deysi.arqhax.demo.application.ports.out;

import com.deysi.arqhax.demo.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);
}
