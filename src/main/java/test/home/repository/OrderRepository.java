package test.home.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import test.home.entity.Order;

/**
 * Created by User on 17.05.2018.
 */
@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

    Order findById(Long id);

}
