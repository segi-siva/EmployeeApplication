package com.app.customer_service.service.impl;

import com.app.customer_service.Entity.Customer;
import com.app.customer_service.dto.CustomerDto;
import com.app.customer_service.exception.ResourceNotFoundException;
import com.app.customer_service.service.CustomerService;

public class CustomerApplicationService implements CustomerService {

    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {
        Customer customer = mapToEntity(customerDto);
        Customer created = customerRepository.save(customer);
        return mapToDto(created);
    }

    @Override
    public CustomerDto getByCustomerEmail(String email) {
        Customer customer = null;
        if(customerRepository.existsByCustomerEmail(email)){
            customer = customerRepository.findByCustomerEmail(email);
        }else {
            throw new ResourceNotFoundException("Customer","Email",email);
        }

        return mapToDto(customer);
    }
}
