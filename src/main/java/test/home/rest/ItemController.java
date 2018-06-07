package test.home.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import test.home.dto.ItemDto;
import test.home.service.ItemService;

import java.util.Collection;

/**
 * Created by User on 17.05.2018.
 */
@RestController
public class ItemController {

    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }


    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    Collection<ItemDto> getAll() {
        return itemService.getAll();
    }
}
