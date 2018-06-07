package test.home.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import test.home.entity.Author;

/**
 * Created by User on 07.06.2018.
 */

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
