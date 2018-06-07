package test.home.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import test.home.dto.ItemDto;
import test.home.repository.ItemRepository;
import test.home.service.ItemService;

/**
 * Created by User on 17.05.2018.
 */
@RestController
public class ItemController {

    private final ItemService itemService;
    private final ItemRepository itemRepository;

    @Autowired
    public ItemController(ItemService itemService, ItemRepository itemRepository) {
        this.itemService = itemService;
        this.itemRepository = itemRepository;
    }


   /* @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public Collection<ItemDto> getAll() {
        return itemService.getAll();
    }*/

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public ItemDto findById(@PathVariable(name = "id") Long id) {
        return itemService.getItem(id);
    }
/*
    @RequestMapping(value = "/changeRate/{id}/{rate}", method = RequestMethod.GET)
    public ItemDto changeRate(@PathVariable(name = "id") Long id,
                              @PathVariable(name = "rate") double rate) {
        return itemService.changeRating(id, rate);
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    void create() {
        itemService.init();
    }*/
}
