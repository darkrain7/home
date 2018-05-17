package test.home.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Builder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by User on 17.05.2018.
 */

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "order", schema = "public")
public class Order {

    @Id
    private Long id;

    @OneToMany(mappedBy = "order")
    Set<ItemAndOrder> itemAndOrders = new HashSet<>();

}
