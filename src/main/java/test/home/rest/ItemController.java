package test.home.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import test.home.dto.ItemDto;
import test.home.service.ItemService;

/**
 * Created by User on 17.05.2018.
 */
@Controller
public class ItemController {

    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }


    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    ItemDto getItem(@PathVariable("id") Long id) {
        return itemService.getItem(id);
    }
}
