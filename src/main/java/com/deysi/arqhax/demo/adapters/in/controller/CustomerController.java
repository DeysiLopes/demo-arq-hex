package com.deysi.arqhax.demo.adapters.in.controller;

import com.deysi.arqhax.demo.adapters.in.controller.mapper.CustomerMapper;
import com.deysi.arqhax.demo.adapters.in.controller.request.CustomerRequest;
import com.deysi.arqhax.demo.adapters.in.controller.response.CustomerResponse;
import com.deysi.arqhax.demo.application.ports.in.FindCustomerByIdInputPort;
import com.deysi.arqhax.demo.application.ports.in.InsertCustomerInputPort;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerInputPort insertCustomerInputPort;

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private FindCustomerByIdInputPort findCustomerByIdInputPort;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest){
         var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerInputPort.insert(customer, customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable final String id){
        var cutomer = findCustomerByIdInputPort.find(id);
        var cutomerResponse = customerMapper.toCustomerResponse(cutomer);
        return ResponseEntity.ok().body(cutomerResponse);
    }

}
