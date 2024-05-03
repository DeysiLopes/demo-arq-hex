package com.deysi.arqhax.demo.adapters.out.repository.mapper;

import com.deysi.arqhax.demo.adapters.out.repository.entity.CustomerEntity;
import com.deysi.arqhax.demo.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);
}
