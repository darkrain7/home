package test.home.service;

import test.home.dto.ItemDto;

import java.util.Collection;

/**
 * Created by User on 17.05.2018.
 */
public interface ItemService {

    ItemDto getItem(Long id);

    Collection<ItemDto> getAll();
}
