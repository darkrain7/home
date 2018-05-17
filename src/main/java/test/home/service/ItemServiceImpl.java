package test.home.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.home.converter.ItemToItemDtoConverter;
import test.home.dto.ItemDto;
import test.home.repository.ItemRepository;

/**
 * Created by User on 17.05.2018.
 */

@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public ItemDto getItem(Long id) {
        return ItemToItemDtoConverter.convert(itemRepository.findById(id));
    }
}
