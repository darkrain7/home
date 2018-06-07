package test.home.service;

import test.home.dto.ItemDto;
import test.home.entity.Item;

import java.util.Collection;

/**
 * Created by User on 17.05.2018.
 */
public interface ItemService {

    ItemDto getItem(Long id);

    Collection<ItemDto> getAll();

    ItemDto changeRating (Long id, double rate);
}
