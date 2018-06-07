package test.home.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import test.home.entity.Item;

import java.util.Collection;

/**
 * Created by User on 17.05.2018.
 */
@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {

    Item findById(Long id);

    Collection<Item> findAll();
}
