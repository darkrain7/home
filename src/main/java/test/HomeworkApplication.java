package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by User on 17.05.2018.
 */

@SpringBootApplication
@EntityScan(value = "test.home.*")
@ComponentScan("test.home.*")
public class HomeworkApplication {
    public static void main(String[] args) {
        SpringApplication.run(HomeworkApplication.class, args);
    }
}
