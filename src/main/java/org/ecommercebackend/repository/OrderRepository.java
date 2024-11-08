package org.ecommercebackend.repository;

import io.quarkus.hibernate.reactive.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.ecommercebackend.model.entity.Order;

@ApplicationScoped
public class OrderRepository implements PanacheRepository<Order> {
}
