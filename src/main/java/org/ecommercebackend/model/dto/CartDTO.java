package org.ecommercebackend.model.dto;

import lombok.Getter;
import lombok.Setter;
import org.ecommercebackend.model.entity.Customer;

@Setter
@Getter
public class CartDTO {
    private int cartId;
    private Customer customer;
}
