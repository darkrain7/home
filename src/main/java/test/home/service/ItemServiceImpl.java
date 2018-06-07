package test.home.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static test.home.converter.ItemConverter.convertListToDto;
import static test.home.converter.ItemConverter.convertToDto;

import test.home.dto.ItemDto;
import test.home.entity.Author;
import test.home.entity.Item;
import test.home.repository.AuthorRepository;
import test.home.repository.ItemRepository;

import java.util.Collection;

/**
 * Created by User on 07.06.2018.
 */

@Slf4j
@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;
    private final AuthorRepository authorRepository;

    @Autowired
    public ItemServiceImpl(ItemRepository itemRepository, AuthorRepository authorRepository) {
        this.itemRepository = itemRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public ItemDto getItem(Long id) {
        return convertToDto(itemRepository.findById(id));
    }

    @Override
    public Collection<ItemDto> getAll() {
         return convertListToDto(itemRepository.findAll());
    }

    @Override
    public ItemDto changeRating(Long id, double rate) {
        Item currentItem = itemRepository.findById(id);

        double currentItemRating  = currentItem.getRating();
        Long countVoice = currentItem.getCountVoice();

        double newRate = (currentItemRating * countVoice + rate) / (countVoice + 1);
        Long newCountVoice = countVoice + 1;

        currentItem.setRating(newRate);
        currentItem.setCountVoice(newCountVoice);

        itemRepository.save(currentItem);

        return convertToDto(currentItem);
    }

    @Override
    public void init() {
        Author author = Author.builder().name("Test name Author").build();
        authorRepository.save(author);
        Item item1 = Item.builder().name("Test name 1")
                .genre("Genre 1")
                .titleImg("Img 1")
                .author(author)
                .build();
        itemRepository.save(item1);
        Item item2 = Item.builder().name("Name 2")
                .genre("Genre 2")
                .titleImg("Img 2")
                .author(author)
                .build();
        itemRepository.save(item2);
    }
}
