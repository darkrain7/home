package test.home.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import test.home.entity.Author;
import test.home.entity.Item;

import java.util.Collection;

/**
 * Created by User on 08.06.2018.
 */

@Repository
public class SuperItemRepositoryImpl implements SuperItemRepository {
    @Override
    public Item findById(Long id) {
        Author author = Author.builder().name("Author build").build();
        return Item.builder().name("Item Build").author(author).genre("Genre Build").rating(10).countVoice(50L).build();
    }

    @Override
    public Collection<Item> findAll() {
        return null;
    }
}
