package test.home.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static test.home.converter.ItemConverter.convertListToDto;
import static test.home.converter.ItemConverter.convertToDto;

import test.home.dto.ItemDto;
import test.home.entity.Item;
import test.home.repository.ItemRepository;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by User on 07.06.2018.
 */

@Slf4j
@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public ItemDto getItem(Long id) {
        return convertToDto(itemRepository.findById(id));
    }

    @Override
    public Collection<ItemDto> getAll() {
        return convertListToDto(itemRepository.findAll());
    }
}
