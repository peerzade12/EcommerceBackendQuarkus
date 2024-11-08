package org.ecommercebackend.model.mapper;

import org.mapstruct.Mapper;
import org.ecommercebackend.model.dto.CartDTO;
import org.ecommercebackend.model.entity.Cart;

@Mapper(componentModel = "cdi")
public interface CartMapper {
    Cart cartDTOToCart(CartDTO cartDTO);

    CartDTO cartToCartDTO(Cart cart);
}
