package com.deysi.arqhax.demo.application.ports.in;

import com.deysi.arqhax.demo.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
