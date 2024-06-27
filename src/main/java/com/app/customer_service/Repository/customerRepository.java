package com.app.customer_service.Repository;

import com.app.customer_service.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface customerRepository extends JpaRepository<Customer,Integer> {
    Customer findByCustomerEmail(String email);
    Boolean existsByCustomerEmail(String email);
}
