package test.home.converter;

import test.home.dto.ItemDto;
import test.home.entity.Item;

/**
 * Created by User on 17.05.2018.
 */
public class ItemConverter {

    public static Item convertToEntity(ItemDto fromObject) {
        Item item = Item.builder()
                .id(fromObject.getId())
                .name(fromObject.getName())
                .price(fromObject.getPrice())
                .build();
        return item;
    }

    public static ItemDto convertToDto(Item fromObject) {
        ItemDto itemDto = ItemDto.builder()
                .id(fromObject.getId())
                .name(fromObject.getName())
                .price(fromObject.getPrice())
                .build();

        return itemDto;
    }
}
