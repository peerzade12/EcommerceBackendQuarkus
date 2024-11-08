package org.ecommercebackend.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.ecommercebackend.model.entity.Customer;
import org.ecommercebackend.model.entity.Product;
import org.ecommercebackend.model.entity.enums.OrderStatus;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    private OrderStatus status;
    private List<Product> productList;
    private Customer customer;
}
