package test.home.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.home.dto.OrderDto;
import test.home.repository.OrderRepository;

/**
 * Created by User on 17.05.2018.
 */
@Service
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderDto getOrder(Long id) {
        return orderRepository.findById(id);
    }
}
