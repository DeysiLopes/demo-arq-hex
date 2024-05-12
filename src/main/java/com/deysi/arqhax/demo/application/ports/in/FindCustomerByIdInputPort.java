package com.deysi.arqhax.demo.application.ports.in;

import com.deysi.arqhax.demo.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);
}
