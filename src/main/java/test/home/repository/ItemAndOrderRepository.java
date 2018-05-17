package test.home.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import test.home.entity.ItemAndOrder;

/**
 * Created by User on 18.05.2018.
 */
@Repository
public interface ItemAndOrderRepository extends CrudRepository<ItemAndOrder, Long> {

}
