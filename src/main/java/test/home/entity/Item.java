package test.home.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Builder;

import javax.persistence.*;
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
@Table(name = "item", schema = "public")
public class Item {

    @Id
    @GeneratedValue(generator = "sqn_item", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "sqn_item", sequenceName = "SQN_ITEM", allocationSize = 1)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Long price;

    @OneToMany(mappedBy = "item")
    Set<ItemAndOrder> itemAndOrders = new HashSet<>();
}
