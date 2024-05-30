package com.deysi.arqhax.demo.adapters.in.controller.mapper;

import com.deysi.arqhax.demo.adapters.in.controller.request.CustomerRequest;
import com.deysi.arqhax.demo.adapters.in.controller.response.CustomerResponse;
import com.deysi.arqhax.demo.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "validCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer );
}
