package org.ecommercebackend.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.ecommercebackend.model.dto.OrderDTO;
import org.ecommercebackend.model.entity.Order;

@Mapper(componentModel = "cdi")
public interface OrderMapper {

    @Mapping(target = "orderDate", expression = "java(java.time.LocalDate.now())")
    @Mapping(source = "productList", target = "products")
    @Mapping(target = "totalQuantity", expression = "java(orderDTO.getProductList().size())")
    @Mapping(target = "totalPrice", expression = "java(orderDTO.getProductList().stream().mapToDouble(Product::getPrice).sum())")
    @Mapping(target = "orderId", ignore = true)
    Order orderDTOToOrder(OrderDTO orderDTO);


    @Mapping(source = "products", target = "productList")
    OrderDTO orderToOrderDTO(Order order);
}
