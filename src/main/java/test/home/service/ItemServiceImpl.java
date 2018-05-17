package test.home.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.home.converter.ItemConverter;
import test.home.dto.ItemDto;
import test.home.entity.Item;
import test.home.entity.ItemAndOrder;
import test.home.entity.Order;
import test.home.repository.ItemAndOrderRepository;
import test.home.repository.ItemRepository;
import test.home.repository.OrderRepository;

import java.util.ArrayList;

/**
 * Created by User on 17.05.2018.
 */

@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;
    private final OrderRepository orderRepository;
    private final ItemAndOrderRepository itemAndOrderRepository;

    @Autowired
    public ItemServiceImpl(ItemRepository itemRepository, OrderRepository orderRepository, ItemAndOrderRepository itemAndOrderRepository) {
        this.itemRepository = itemRepository;
        this.orderRepository = orderRepository;
        this.itemAndOrderRepository = itemAndOrderRepository;
    }

    @Override
    public ItemDto getItem(Long id) {
        return ItemConverter.convertToDto(itemRepository.findById(id));
    }

    public void saveOrder(ArrayList<Item> items) {

        int discount = 0;
        double sum = 0;

        Order newOrder = Order.builder().build();

        for(Item item : items) {
            ItemAndOrder itemAndOrder = ItemAndOrder.builder().order(newOrder).item(item).build();
            itemAndOrderRepository.save(itemAndOrder);
            sum += item.getPrice();
        }

        if (items.size() > 5) discount = 50;

        newOrder.setTotalSum((long) (sum / 100 * discount));

        orderRepository.save(newOrder);

    }

}
