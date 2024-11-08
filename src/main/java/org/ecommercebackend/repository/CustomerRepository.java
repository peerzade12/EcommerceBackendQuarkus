package org.ecommercebackend.repository;

import io.quarkus.hibernate.reactive.panache.PanacheRepository;
import org.ecommercebackend.model.entity.Customer;

public interface CustomerRepository extends PanacheRepository<Customer> {
}
