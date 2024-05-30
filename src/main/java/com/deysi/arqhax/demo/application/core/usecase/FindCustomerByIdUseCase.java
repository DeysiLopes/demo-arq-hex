package com.deysi.arqhax.demo.application.core.usecase;

import com.deysi.arqhax.demo.application.core.domain.Customer;
import com.deysi.arqhax.demo.application.ports.in.FindCustomerByIdInputPort;
import com.deysi.arqhax.demo.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.stereotype.Service;

@Service
public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    @Override
    public Customer find(String id){
        return findCustomerByIdOutputPort.find(id).orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
