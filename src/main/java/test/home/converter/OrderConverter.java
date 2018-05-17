package test.home.converter;

import test.home.dto.OrderDto;
import test.home.entity.Order;

/**
 * Created by User on 17.05.2018.
 */
public class OrderConverter {

    public static Order convertToEntity(OrderDto fromObject) {
        Order order = Order.builder()
                .id(fromObject.getId())
                .build();
        return order;
    }

    public static OrderDto convertToDto(Order fromObject) {
        OrderDto orderDto = OrderDto.builder()
                .id(fromObject.getId())
                .build();
        return orderDto;
    }
}
