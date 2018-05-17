package test.home.converter;

import test.home.dto.ItemDto;
import test.home.entity.Item;

/**
 * Created by User on 17.05.2018.
 */
public class ItemDtoToItemConverter {

    public static Item convert(ItemDto fromObject) {
        Item item = Item.builder()
                .id(fromObject.getId())
                .name(fromObject.getName())
                .build();
        return item;
    }
}
