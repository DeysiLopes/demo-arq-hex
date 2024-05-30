package com.deysi.arqhax.demo.application.ports.in;

import com.deysi.arqhax.demo.application.core.domain.Customer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
