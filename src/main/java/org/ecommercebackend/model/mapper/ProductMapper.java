package org.ecommercebackend.model.mapper;

import org.mapstruct.Mapper;
import org.ecommercebackend.model.dto.ProductDTO;
import org.ecommercebackend.model.entity.Product;

@Mapper(componentModel = "cdi")
public interface ProductMapper {

    Product productDTOToProduct(ProductDTO productDTO);
    ProductDTO productToProductDTO(Product product);
}
