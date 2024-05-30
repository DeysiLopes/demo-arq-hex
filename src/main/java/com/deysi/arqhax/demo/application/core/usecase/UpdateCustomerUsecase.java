package com.deysi.arqhax.demo.application.core.usecase;

import com.deysi.arqhax.demo.application.core.domain.Customer;
import com.deysi.arqhax.demo.application.ports.in.FindCustomerByIdInputPort;
import com.deysi.arqhax.demo.application.ports.out.FindAddressByZipCodeOutputPort;
import com.deysi.arqhax.demo.application.ports.out.UpdateCustomerOutpuPort;

public class UpdateCustomerUsecase {

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;
    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private  final UpdateCustomerOutpuPort updateCustomerOutpuPort;
    public UpdateCustomerUsecase(FindCustomerByIdInputPort findCustomerByIdInputPort, FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort, UpdateCustomerOutpuPort updateCustomerOutpuPort) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.updateCustomerOutpuPort = updateCustomerOutpuPort;
    }

    private void update(Customer customer, String zipCode){
        findCustomerByIdInputPort.find(customer.getId());
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        updateCustomerOutpuPort.update(customer);
    }
}
