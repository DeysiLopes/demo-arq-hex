package com.deysi.arqhax.demo.application.ports.out;

import com.deysi.arqhax.demo.application.core.domain.Customer;

public interface InsertCustomerOutputPort {
    void insert(Customer customer);
}
