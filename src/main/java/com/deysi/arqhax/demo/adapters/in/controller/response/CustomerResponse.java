package com.deysi.arqhax.demo.adapters.in.controller.response;

import com.deysi.arqhax.demo.application.core.domain.Address;
import lombok.Data;

@Data
public class CustomerResponse {

    private String name;

    private Address address;

    private String cpf;

    private Boolean isValidCpf;
}
