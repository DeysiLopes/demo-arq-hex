package com.deysi.arqhax.demo.adapters.out.client.mapper;

import com.deysi.arqhax.demo.adapters.out.client.response.AddressResponse;
import com.deysi.arqhax.demo.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
