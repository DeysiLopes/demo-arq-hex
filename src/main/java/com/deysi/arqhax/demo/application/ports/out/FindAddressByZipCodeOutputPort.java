package com.deysi.arqhax.demo.application.ports.out;

import com.deysi.arqhax.demo.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
