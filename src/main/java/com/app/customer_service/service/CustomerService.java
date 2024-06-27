package com.app.customer_service.service;

public interface CustomerService {
  CustomerDto createCustomer(CustomerDto customerDto);
  CustomerDto getByCustomerEmail(String email);
}
