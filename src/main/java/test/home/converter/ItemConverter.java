package test.home.converter;

import test.home.dto.ItemDto;
import test.home.entity.Item;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by User on 17.05.2018.
 */
public class ItemConverter {

    public static Item convertToEntity(ItemDto fromObject) {
        Item item = Item.builder()
                .id(fromObject.getId())
                .name(fromObject.getName())
                .genre(fromObject.getGenre())
                .titleImg(fromObject.getTitleImg())
                .author(fromObject.getAuthor())
                .build();
        return item;
    }

    public static ItemDto convertToDto(Item fromObject) {
        ItemDto itemDto = ItemDto.builder()
                .id(fromObject.getId())
                .name(fromObject.getName())
                .genre(fromObject.getGenre())
                .titleImg(fromObject.getTitleImg())
                .author(fromObject.getAuthor())
                .build();

        return itemDto;
    }

    public static Collection<ItemDto> convertListToDto(Collection<Item> fromObjects) {
        Collection<ItemDto> itemDtos = new ArrayList<>();
        ItemDto itemDto;
        for (Item item : fromObjects) {
            itemDto = convertToDto(item);
            itemDtos.add(itemDto);
        }

        return itemDtos;
    }
}
