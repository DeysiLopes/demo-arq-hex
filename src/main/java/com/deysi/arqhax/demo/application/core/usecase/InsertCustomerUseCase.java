package com.deysi.arqhax.demo.application.core.usecase;

import com.deysi.arqhax.demo.application.core.domain.Customer;
import com.deysi.arqhax.demo.application.ports.in.InsertCustomerInputPort;
import com.deysi.arqhax.demo.application.ports.out.FindAddressByZipCodeOutputPort;
import com.deysi.arqhax.demo.application.ports.out.InsertCustomerOutputPort;
import org.springframework.stereotype.Service;

@Service
public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustomerUseCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort, InsertCustomerOutputPort insertCustomerOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    @Override
    public void insert(Customer customer, String zipCode){
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
    }
}
