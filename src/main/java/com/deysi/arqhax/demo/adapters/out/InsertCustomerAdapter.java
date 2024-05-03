package com.deysi.arqhax.demo.adapters.out;

import com.deysi.arqhax.demo.adapters.out.repository.CustomerRepository;
import com.deysi.arqhax.demo.adapters.out.repository.mapper.CustomerEntityMapper;
import com.deysi.arqhax.demo.application.core.domain.Customer;
import com.deysi.arqhax.demo.application.ports.out.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;
    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
