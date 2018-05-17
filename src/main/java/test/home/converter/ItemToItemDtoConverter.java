package test.home.converter;

import test.home.dto.ItemDto;
import test.home.entity.Item;

/**
 * Created by User on 17.05.2018.
 */
public class ItemToItemDtoConverter {

    public static ItemDto convert(Item fromObject) {
        ItemDto itemDto = ItemDto.builder()
                .id(fromObject.getId())
                .name(fromObject.getName())
                .build();

        return itemDto;
    }
}
