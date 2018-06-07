package test.home.repository;

import org.springframework.stereotype.Repository;
import test.home.entity.Item;

import java.util.Collection;

/**
 * Created by User on 08.06.2018.
 */
public interface SuperItemRepository {

    Item findById(Long id);

    Collection<Item> findAll();

}
